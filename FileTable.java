/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Desktop;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author npget
 */
public class FileTable extends JPanel {
    private boolean DEBUG = false;
  private javax.swing.JTable tableFile;

  public String  ricavaPather() throws IOException{
       final FormOne sezione = new FormOne();

  return sezione.ricavaPath().toString();
  }
  
    public FileTable(String valid) throws IOException {
        super(new GridLayout(1,0));
          String line = null; 
          
//          File f = new File("NpGet/archfile.csv");
 //       String archfile = f.getPath();
     String archfile = ricavaPather()+"archfile.csv";
        
        ArrayList<String[]> righeArcFile = new ArrayList<>();
     //definisco il modello della tabella un pezzo alla volta, per avere maggiore flessibilita'
            final DefaultTableModel modelloArchFile = new DefaultTableModel();
            //dichiaro le colonne
            modelloArchFile.setColumnIdentifiers(new String[]{"ID","NomeFile"});
        try(FileReader csvFile = new FileReader(archfile); BufferedReader br = new BufferedReader(csvFile)) {
  while ((line = br.readLine()) != null) {
   righeArcFile.add(line.split(","));
  }
   for (String[] riga : righeArcFile) {
                //per ogni riga letta dal file e salvata in righeArchivio creo un vettore
                final Vector<String> rigaDati = new Vector<>();
                //aggiungo i campi di interesse nel vettore
               // rigaDati.add(riga[0]);
                rigaDati.add(riga[1]);
                rigaDati.add(GetFileName(riga[2]));
                //aggiungo il vettore al modello della tabella
                modelloArchFile.addRow(rigaDati);
            }
    final TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelloArchFile);
 
       final JTable tableFile = new JTable();
  tableFile.setModel(modelloArchFile);
          
        tableFile.setPreferredScrollableViewportSize(new Dimension(500, 70));
        tableFile.setFillsViewportHeight(true);
            tableFile.setRowSorter(sorter);

            
            
            
             
            
            //imposto nella tabella il modello e l'oggetto che fara' l'ordinamento
  final TableRowSorter<DefaultTableModel> sorterDl = (TableRowSorter<DefaultTableModel>) tableFile.getRowSorter();
      
        
        // preparo un array list per i filtraggi ... 
        java.util.List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>();

  if(!"".equals(valid)){
             
 //filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL,Integer.parseInt(valid),1));
  filters.add(RowFilter.regexFilter(valid,0));
        System.out.println(""+valid);
         }       
RowFilter<Object,Object> serviceFilter = RowFilter.andFilter(filters);
  
// sparo tutto sul sorter iniziale 
       sorterDl.setRowFilter(serviceFilter);    
            
            
            
            
   //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(tableFile);

        //Add the scroll pane to this panel.
        add(scrollPane);
        System.out.println(valid);
        
          tableFile.addMouseListener(new java.awt.event.MouseAdapter() {
         
           public void mouseClicked(java.awt.event.MouseEvent e)
{
int row=tableFile.rowAtPoint(e.getPoint());
int col= tableFile.columnAtPoint(e.getPoint());

String FileOpen=tableFile.getValueAt(row,col).toString();

             
//System.out.println("val"+tableFile.getValueAt(row,col).toString());
               try {
    LetturaFile(FileOpen);
System.out.println(FileOpen);
               } catch (IOException ex) {
Logger.getLogger(FileTable.class.getName()).log(Level.SEVERE, null, ex);
               }
}

            
            
        });
        
            } catch (IOException e) {
            e.printStackTrace();
        }
       
      
       

       
    }
    


    
    
    public static String GetFileName(String path){
   File userFile = new File(path);
String Path = userFile.getName();
        
        
   //  String Path=path.substring(path.lastIndexOf("/")+1, path.length());
        
     
      /* 
         if ( Path.endsWith("\"")){
            Path= Path.substring(1, Path.length() - 1);
  } else{
            Path= Path;
    } 
        */ 
   
   return    Path = Path.replaceAll("\"","");
   // return Path .;
 
    }
    
    
      private void LetturaFile(String NameFinal)throws FileNotFoundException, IOException { //To change body of generated methods, choose Tools | Templates.
// String FileGet = System.getProperty("user.dir")+"/NpGet/f/"+NameFinal;
    String FileGet = ricavaPather()+"f/"+NameFinal;    
    File fileF= new File (FileGet);
      
 
    if (Desktop.isDesktopSupported()) {
    try {

           
        Desktop.getDesktop().open(fileF);
    } catch (IOException ex) {
//          System.out.println("ERRORE"+System.getProperties());
        // no application registered for PDFs
    }
}
         
        }
    
    
    
    
    
    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() throws IOException {
        //Create and set up the window.
        JFrame frame = new JFrame("SimpleTableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


JLabel lblin = new JLabel("I",SwingConstants.CENTER); lblin.setPreferredSize(new Dimension(300, 100));
        //Create and set up the content pane.
        FileTable newContentPane = new FileTable("");
        
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

frame.getContentPane().add(lblin, BorderLayout.CENTER);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (IOException ex) {
                    Logger.getLogger(FileTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
}
