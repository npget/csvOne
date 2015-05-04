/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.animation.KeyValue;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author npget
 */
public class csvFormx extends javax.swing.JInternalFrame {

    /**
     * Creates new form csvFormx
     */
    public csvFormx() throws IOException {
        initComponents();
           CaricaSezioni();
    CaricaArchivioTot();
    }
    
    
    
    
    public void CaricaSezioni() throws FileNotFoundException, IOException {

        String csvFile = "/home/npget/NetBeansProjects/csvOne/src/gui/sezioni.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        List ls = new ArrayList();
        List lsid= new ArrayList();
        List sector= new ArrayList();
int i=0;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] csvrighe = line.split(cvsSplitBy);

      
                
                
 //    String[] sezioni = {"[Id= " + csvrighe[0] + " , name=" + csvrighe[3] + "]"};
        ls.add(csvrighe[3]);

        lsid.add(csvrighe[0]);            
            jComboBox1.addItem(csvrighe[3]);
            
            i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(ls.toArray()));

         
        
// jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(sezioni));       

	//System.out.println("Done");
    }

    public void CaricaArchivioTot() throws FileNotFoundException, IOException {

        
   /*       
 jTable1.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {{"idva", "dddva"},
               {"idval", "dddval"}}, 
            new String [] {
                "id", "ddd"
            }
        ));
 */

       

        
        
       
String csvFilearch = "/home/npget/NetBeansProjects/csvOne/src/gui/archivio.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int  n=0;
       ArrayList alist;
        alist = new ArrayList();
ArrayList alist1;
        alist1 = new ArrayList();
        
        ArrayList alist2;
        alist2 = new ArrayList();
         ArrayList alist3;
        alist3 = new ArrayList();
        ArrayList alist4;
        alist4 = new ArrayList();
         int i = 0;
        String data= fieldate.getText();
try {

br = new BufferedReader(new FileReader(csvFilearch));
 while ((line = br.readLine()) != null) {

   

String[] names = line.split(cvsSplitBy);
  //Object[][] dataq=   {line.split(cvsSplitBy)};
//System.out.println("Value of data: "+Arrays.deepToString(dataq));
   
     
alist.add(names[1]);
alist1.add(names[2]);
alist2.add(names[3]);
alist3.add(names[4]);
alist4.add(names[5]);

//String[][] lsarch = {csvrighe};
//System.out.println(alist.get(i));
//System.out.println(alist.get(i)+"-"+alist1.get(i));



//jTable1.getModel().setValueAt(alist.get(i),i,0);
//jTable1.getModel().setValueAt("Arturo",7,0);
/*
jTable1.getModel().setValueAt(names[0],i,0);
jTable1.getModel().setValueAt(names[1],i,1);
jTable1.getModel().setValueAt(names[2],i,2);
jTable1.getModel().setValueAt(names[3],i,3);
jTable1.getModel().setValueAt(names[4],i,4);
jTable1.getModel().setValueAt(names[5],i,5);
jTable1.getModel().setValueAt(names[6],i,6);
*/
//jTable1.getModel().setValueAt(data[0],i,0);
//jTable1.getModel().setValueAt(csvrighe[3],i,1);
//jTable1.getModel().setValueAt(lsarch.get(1),i,1);
//jTable1.getModel().setValueAt(lsarch[2],i,2); 
//jTable1.getModel().setValueAt(lsarch[3],i,3); 

       // cosi ritorna object quanti i giri di while 
 //System.out.println(alist.toArray());
 
  // cosi ritorna tutto  solo un vettore  
// System.out.println(names[0]);
 

                i++;

            }
       // cosi ritorna object 
 //System.out.println(alist.toArray());
 
 
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
     new Object [][] {
         {alist.get(0),alist1.get(0),alist2.get(0),alist3.get(0),alist4.get(0)},
     {alist.get(1),alist1.get(1),alist2.get(1),alist3.get(1),alist4.get(1)}}, 
            new String [] {
                "IDA","IDB","IDC","IDD","Data"
            }
        ));
                      
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(lsarch.toArray()));
// jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(sezioni));       
    }



    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelinfo = new javax.swing.JLabel();
        fieldate = new javax.swing.JTextField();
        btngo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FormArcher");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        fieldate.setText("01/2015");

        btngo.setText("Go.");
        btngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btngo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(labelinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btngo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
     Point point = evt.getPoint();
      int row,column;
      row 	= jTable1.rowAtPoint(point);
      column 	= jTable1.columnAtPoint(point);
      
      labelinfo.setText( "Click alla:Riga:"+
		     row+" | Colonna:"+column+
		     " Vale: " + jTable1.getValueAt(row,column)
		   );
    }                                    

    private void btngoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    

        
   /*       
 jTable1.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {{"idva", "dddva"},
               {"idval", "dddval"}}, 
            new String [] {
                "id", "ddd"
            }
        ));
 */

       

        
        
       
String csvFilearch = "/home/npget/NetBeansProjects/csvOne/src/gui/archivio.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int  n=0;
       ArrayList alist;
        alist = new ArrayList();
ArrayList alist1;
        alist1 = new ArrayList();
        
        ArrayList alist2;
        alist2 = new ArrayList();
         ArrayList alist3;
        alist3 = new ArrayList();
        ArrayList alist4;
        alist4 = new ArrayList();
         int i = 0;
        String data= fieldate.getText();
try {

br = new BufferedReader(new FileReader(csvFilearch));
 while ((line = br.readLine()) != null) {

   

String[] names = line.split(cvsSplitBy);


//PROVA RICERCA DATA 
     if(data.equals(names[5].toString())==true){
     
alist.add(names[1]);
alist1.add(names[2]);
alist2.add(names[3]);
alist3.add(names[4]);
alist4.add(names[5]);
}
//String[][] lsarch = {csvrighe};
//System.out.println(alist.get(i));
//System.out.println(alist.get(i)+"-"+alist1.get(i));



//jTable1.getModel().setValueAt(alist.get(i),i,0);
//jTable1.getModel().setValueAt("Arturo",7,0);
/*
jTable1.getModel().setValueAt(names[0],i,0);
jTable1.getModel().setValueAt(names[1],i,1);
jTable1.getModel().setValueAt(names[2],i,2);
jTable1.getModel().setValueAt(names[3],i,3);
jTable1.getModel().setValueAt(names[4],i,4);
jTable1.getModel().setValueAt(names[5],i,5);
jTable1.getModel().setValueAt(names[6],i,6);
*/
//jTable1.getModel().setValueAt(data[0],i,0);
//jTable1.getModel().setValueAt(csvrighe[3],i,1);
//jTable1.getModel().setValueAt(lsarch.get(1),i,1);
//jTable1.getModel().setValueAt(lsarch[2],i,2); 
//jTable1.getModel().setValueAt(lsarch[3],i,3); 

       // cosi ritorna object quanti i giri di while 
 //System.out.println(alist.toArray());
 
  // cosi ritorna tutto  solo un vettore  
// System.out.println(names[0]);
 

                i++;

            }
       // cosi ritorna object 
 //System.out.println(alist.toArray());
 
 
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
     new Object [][] {
         {alist.get(0),alist1.get(0),alist2.get(0),alist3.get(0),alist4.get(0)},
     {alist.get(1),alist1.get(1),alist2.get(1),alist3.get(1),alist4.get(1)}}, 
            new String [] {
                "IDA","IDB","IDC","IDD","Data"
            }
        ));
                      
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(lsarch.toArray()));
// jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(sezioni));       
    

    
    }                                     


    // Variables declaration - do not modify                     
    private javax.swing.JButton btngo;
    private javax.swing.JTextField fieldate;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelinfo;
    // End of variables declaration                   

 
}
