Esempio di come Java  legge e interpreta i csv ...
Quello che sto cercando è di fare delle ricerche dinamiche tramite 3 
file csv 


in priorità il primo file è sezioni.csv  mi serve qui la prima colonna[0] e il nome[3]
"1","1","4","GruppoOne","1420720559","nd"
"2","2","4","GruppoOneTwo","1420720685","nd"
"3","1","4","GruppoOneTree","1420720817","nd"



il secondo è archivio.csv
la prima è l id e la seconda è la chiave di ricerca da selezioni ...
1,1,12312312312,03A2014,NomeOne,01/2015,note edit,2015
2,1,879543,03A2014,NomeOneTwo,01/2015,noteAltre,2015



e il terzo urlfile.csv 
il primo è id e il secondo è la chiave da archivio.csv 
"1","3","../f/files/f_1004/9/21/TT1xSFisdO_288_.pdf"
"1","3","../f/files/f_1004/9/21/TT1xSFisdO_288_.pdf"



Per FArla breve ...
La combobox dovrebbe iterare sezioni.csv con id e nome 
per poi permettere di  filtrare tutto archivio.csv che hanno come seconda voce l id passato da sezioni  
in terza battuta l id di archivio.csv filtra il terzo csv dal quale ottengo file ... 
Todo .. qui 
Finora manca  id,nome nella combobox , passo solo il nome ,, mi serve l id 
e l arRay della jtable 
Ho effettuato prove di ricerca dentro una colonna .Esito sembra che va ...
R.f
