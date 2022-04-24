import java.util.* ; 
public class regionn { 
	
	 private static String [] region = {"Ariana", "Beja","Ben Arous","Bizerte","Gabes","Jendouba", "Mahdia","Manouba","Zaghouane","Kairouan","Kasserine","Kebeli","Le kef","Gafsa" ,"Medenine","Monastir","Nabeul","Sfax","Sidi bouzid","Siliana","Sousse","Tataouine","Tozeur","Tunis"};
	 private static String [][] adr = {
		 {"Ecole Primaire Riadh Ennaser","Ecole Ebn Sina Mnihla","Ecole 18 Janvier Ettadhamen ","Ecole  Sidi Fraj Sokra " },
		 {"Ecole primaire Rue de Bourguiba Beja","Ecole Primaire Sidi S'hili","Ecole primaire hached Beja Nord","Ecole Primaire  Le Future beja "},
		 {"Ecole primaire Republique Ben arous","Ecole primaire Mhamdia Ben arous","Ecole Rue Saada Mhamdea","Ecole 2 Mars Cite nouvelle 1 "},
		 {"Ecole primaire Ebn khaldoun el aali","Ecole primaire 14 Janvier el aalia","Ecole Sidi Othmen","Ecole Enadhour Octtobre 15 "},
		 {"Ecole primaire Kaser el Hamma","Ecole Oued el Hamma ","Ecole Primaire El Midda","Ecole Primaire Matmata "},
		 {"Ecole primaire Somrane ","Ecole primaire Rue Hbib Themeur ","Ecole Primaire El Nour ","Ecole El feyez  "},
		 {"Ecole primaire ebn Sina  ","Ecole primaire Ajourea Jamm ","Ecole Primaire Abasea ","Ecole El ferjen  "},
		 {"Ecole primaire Municipalite ","Ecole primaire Batan ","Ecole Primaire El Toufoula  ","Ecole Sohnoun  "},
		 {"Ecole primaire Sadikia ","Ecole primaire beb jdid  ","Ecole Primaire Rue Russie  ","Ecole Rue Magreb  "},
		 {"Ecole primaire houHneya zaghouane ","Ecole primaire  Zahra zaghouane ","Ecole Primaire el ghiran ","Ecole Sidi Mansour "},};
	 
	 public  String [] saisir() {
		Scanner s = new Scanner(System.in);
		int n ;
		 for (int i=0;i<24;i++)
		   {	
			 System.out.print((i+1)+". "+region[i]+"   ");
			 	if (i%2==0)
			   System.out.println(); 
			   
			  
		   }
		   System.out.print("0.Annuler \n Choisir une region");
		  do { 
			  n=s.nextInt();
		  }while(n<0||n>24);
		  
		  for (int i = 0 ; i<=3;i++) {
			  System.out.println((i+1)+". "+adr[n-1][i]) ; }
		 
		  int x;
		do {
			  System.out.println("Selectionner Une Adresse ") ; 
			   x = s.nextInt();}while (x<0 || x>4) ; 
		  
		 String  [] resultat = new String [2]; 
		 resultat[0] = region[n-1] ; 
		 resultat [1]=adr[n-1][x-1];
		  return resultat ;}


	
	/**
	 * @return the region
	 */
	public static String[] getRegion() {
		return region;
	}



	/**
	 * @param region the region to set
	 */
	public static void setRegion(String[] region) {
		regionn.region = region;
	}



	public static String[][] getAdr() {
		return adr;
	}


	public static void setAdr(String[][] adr) {
		regionn.adr = adr;
	}
	
	
	
	
	
}


