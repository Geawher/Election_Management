import java.text.DecimalFormat;
import java.util.*;

public class Main {
	
		public static void Menu1() {
			System.out.println("||================================================||");
			System.out.println("||      BIENVENUE a LA GESTION D'ELECTIONS        ||");
			System.out.println("||================================================||");
			System.out.println("||          VEUILLEZ SAISIR UN CHOIX              ||");
			System.out.println("||================================================||");
			System.out.println("||================================================||");
			System.out.println("||    1 - GESTION Des Electeurs                   ||");			
			System.out.println("||================================================||");
			System.out.println("||    2 - GESTION Des Partis                      ||");
			System.out.println("||================================================||");
			System.out.println("||    3 - GESTION Des Bureaux                     ||");
			System.out.println("||================================================||");
			System.out.println("||    4 - GESTION Des Resultats                   ||");
			System.out.println("||================================================||");
			System.out.println("||    5 - QUITTER                                 ||");
			System.out.println("||================================================||");}
	
	public static void Menu2() {
		System.out.println("||================================================||");
		System.out.println("||      BIENVENUE a LA GESTION D'ELECTTEUR        ||");
		System.out.println("||================================================||");
		System.out.println("||          VEUILLEZ SAISIR UN CHOIX              ||");
		System.out.println("||================================================||");
		System.out.println("||================================================||");
		System.out.println("||   1 - Inscription d'un Nouveau Electeurs       ||");
		System.out.println("||================================================||");
		System.out.println("||    2- Afficher a partir Du Numero de CIN       ||");
		System.out.println("||================================================||");
		System.out.println("||    3- Afficher a partir Du Numero de Bureau    ||");
		System.out.println("||================================================||");
		System.out.println("||          4 - Accomplissement                   ||");		
		System.out.println("||================================================||");
		System.out.println("||    5 - QUITTER                                 ||");
		System.out.println("||================================================||");}
	
	public static void Menu3() {
		System.out.println(" 1- Ajouter un nouveau bureau  " );
		System.out.println(" 2- Modifier des informations d'un bureau " );
		System.out.println(" 3- Afficher la liste des bureaux");
		System.out.println(" 4- Afficher Nombre total d'incrit par bureau " );
		System.out.println(" 5- Afficher nombre des inscrits qui ont vot� " );
		System.out.println(" 6- Quitter " );}
public static void Menu4() {
		System.out.println(" 1- Ajouter un nouveau Parti  " );
		System.out.println(" 2- Modifier des informations d'un Parti " );
		System.out.println(" 3- Afficher la liste des Partis");
		System.out.println(" 4- Afficher la Parti a partir Du symbole " );
		System.out.println(" 5- Quitter " );}

public static void Menu5(){
	System.out.println("||================================================||");
	System.out.println("||      BIENVENUE a LA GESTION D'ELECTIONS        ||");
	System.out.println("||================================================||");
	System.out.println("||          VEUILLEZ SAISIR UN CHOIX              ||");
	System.out.println("||================================================||");
	System.out.println("||================================================||");
	System.out.println("||          1 - GESTION D ELECTIONS               ||");
	System.out.println("||================================================||");
	System.out.println("||              2 - STATISTIQUE                   ||");
	System.out.println("||================================================||");
	System.out.println("||================================================||");
	System.out.println("||         3 - QUITTER L'APPLICATION              ||");
	System.out.println("||================================================||");
	}


public static void Menu6() { 	
System.out.println("||======================================================||");
System.out.println("||                  STATISTIQUE                         ||");
System.out.println("||======================================================||");
System.out.println("||         1 - TAUX DE VOTE GLOBAL                      ||");
System.out.println("||======================================================||");
System.out.println("||         2 - TAUX DE VOTE PAR REGION                  ||");
System.out.println("||======================================================||");
System.out.println("|| 3 - TAUX DE VOTE PAR TRANCHE D'AGE PAR REGION        ||");
System.out.println("||======================================================||");
System.out.println("||======================================================||");
System.out.println("|| 4 - TAUX DE VOTE PAR TRANCHE D'AGE POUR CHAQUE PARTI ||");
System.out.println("||======================================================||");
System.out.println("||         5 - QUITTER 			                        ||");
System.out.println("||======================================================||");}
	
	public static boolean chiffre(String ch ) {
		int i=0;
	while(i<ch.length() && Character.isDigit(ch.charAt(i) )&& ch.length()==8){
		i=i+1;
		}
		return i==ch.length();}
	
	
public static double [] calcule(String region ,String symbole,ArrayList<Electeur> t1) {
		
		double [] res = new double [5] ; 
		for(int i=0;i<4;i++) { res[i]=0;}
	for(int i=0;i<t1.size();i++) {
		Electeur e = new Electeur() ;
		e=t1.get(i);
		if (e.getB().getRegion().equals(region)) {
			
			if (e.isSituation() && e.getChoix().equals(symbole)) {
				if (e.getB().getNum()==1)
					res[0]++;
				else if (e.getB().getNum()==2)
					res[1]++;
				else if (e.getB().getNum()==3)
					res[2]++;
				else if (e.getB().getNum()==4)
					res[3]++;
				else 
					res[4]++;}}}
	
	return res ;}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		//partie initialisation des objets et des tableaux dynamique 
				Electeur e1=new Electeur("MELEK","Jazzar","14357719",20,true,"hmema",5,"Manouba","Ecole Primaire Municipalite"); 
				Electeur e2=new Electeur("Jawher","Jabri","07233901",19,true,"hmema",5,"Tunis","Ecole primaire Sadikia");
				Electeur e3=new Electeur("Yasmine","Ghoubantini","14357712",20,true,"Rahma",5,"Ariana","Ecole Primaire Riadh Ennaser");
				Electeur e4=new Electeur("Marwen","Sallemi","14357578",26,true,"Afek",4,"Beja","Ecole Primaire Sidi S'hili");
				Electeur e5=new Electeur("Yasmine","Ghoubantini","14357713",20,true,"hmema",5,"Ariana","Ecole Primaire Riadh Ennaser");

				Partis p1 = new Partis("Nahdha","Rached","hmema",12);
				Partis p2 = new Partis("Errahma","Said Jaziri","Rahma",19);
				Partis p3 = new Partis("el-Harak","Moncef Marzouki","Al Irada",18);
				Partis p4=new Partis("Afek Tounes","Yessine ben brahim","Afek",13);
				Bureau b1=new Bureau(5,"Tunis","Ecole primaire Sadikia");
				Bureau b2=new Bureau(5,"Manouba","Ecole Primaire Municipalite");
				Bureau b3=new Bureau(5,"Ariana","Ecole Primaire Riadh Ennaser");
				Bureau b4=new Bureau(4,"Beja","Ecole Primaire Sidi S'hili");
				ArrayList<Electeur> t1 = new ArrayList<Electeur>(Arrays.asList(e1,e2,e3,e4,e5));
				ArrayList<Bureau> t2 = new ArrayList<Bureau>(Arrays.asList(b1,b2,b3,b4));
				ArrayList<Partis> t3 = new ArrayList<Partis>(Arrays.asList(p1,p2,p3,p4));
				ArrayList <String> t4 = new ArrayList<String> ();
		Scanner s = new Scanner (System.in);
		 Electeur e = new Electeur () ; 
		 Partis p = new Partis () ;
         Bureau b = new Bureau();
		 int c,c1,c2,choix1,c5 ; 
		DecimalFormat f = new DecimalFormat();
		f.setMaximumFractionDigits(2);
		 int i=0,j=0,nbr,c3,c4; 
		 String cin,ch;
		 String [] t5 ; 
		 do {
			 Menu5();
			c3=s.nextInt();
			switch(c3) {
			case 1 : 
				do {
				Menu1();
				System.out.print("SAISIR UN CHOIX: ");
				c1=s.nextInt();
				switch (c1) {
				case 1 :
				do {
				 Menu2();
				 System.out.print("SAISIR UN CHOIX: ");
				 c=s.nextInt();
				 switch (c) {
				case 1 ://ajout d'un nouveau Electeur 
				int x;
				
				e=new Electeur();	
				e.inscrire();
				if (t1.contains(e)) {//Verification de L ELECTEUR � Partir Du CIN  
				System.out.println("L ELECTEUR EXISTE DEJA ");}
				else {
				t1.add(e);
				if (!t2.contains(e.getB()))
						t2.add(e.getB());
				System.out.println("L'INSCRIPTION A ETE EFFECTUER ");}
				System.out.println("===========================================");break;
				//============================================
				 case 2:// Affichage d'un electeur a partir du numero CIN 
					 if (t1.isEmpty()==false) {
					do {
						System.out.print("Saisir un Numero CIN" );
						cin = s.next();}
					while(Electeur.chiffre(cin)==false);//Verifier si CIN est Compos�e seulement par des 8 chiifres 
					j=0;
					e=t1.get(j);
					while (e.afficher_electeur(cin)==false  && j<t1.size()) {//Recherche de L ELECTEUR 
					e=t1.get(j);
					j=j+1;}
					
				if (e.afficher_electeur(cin)==true)// On l'affiche Si il Existe par la Methode afficher du Classe Electeur
					e.afficher();
				else {
				System.out.println("L' Electeur n'est pas inscrit ");}}
				else 
					System.out.println("Liste est Vide ");
				System.out.println("================================");
				break;	
			case 3:
				do {
				boolean verif = false ; 
				b=new Bureau ();
				b.saisir();
				for (j=0;j<t1.size();j++) {
				e=t1.get(j);
				if(e.afficher_bureau(b))
				{verif = true  ; 
				e.afficher();}}
				if (verif==false) {
					System.out.println("Pas D'electeur Inscrit Dans Ce bureau") ;}
				do {
				System.out.println("Voulez Vous Resaisir Le numero de Bureau? 1-Oui 0-Non"); 
				x=s.nextInt();}
				while(x<0 || x>1);
				}while(x!=0);
				
				break;
			case 4 : //Accomplissement 
				do {
				System.out.print("Saisir un Numero CIN" );//Verification du CIN 
				cin = s.next();}
				while(chiffre(cin)==false);
				if(t1.isEmpty()==false) {
				e=t1.get(0);// Verifier si l Electeur est inscrit ou non 
				while(e.getCIN().equalsIgnoreCase(cin)==false && j<t1.size()) {
				e=t1.get(j);
				j=j+1;}
				if ((e.getCIN().equalsIgnoreCase(cin)==true) ) {// si l electeur est inscrit on doit verifier sa Situation de vote 
				if (e.isSituation()==true)// il a Deja voter
				System.out.println("Vous avez deja voter" );
				else {
				for(i=0;i<t3.size();i++) { // afficher la liste des partis 
				System.out.println("Le Numero du Partis est ="+(i+1)) ; 
							p=new Partis () ; 
							p=t3.get(i) ; 
							System.out.println("Le nom du parti "+p.getNom());
							System.out.println("Sa pr�sident est "+p.getPres());
							System.out.println("Son Symbole "+p.getSymbole());}
				do {
				System.out.println("Saisir Votre choix" );//Saisir le choix a partir du numero 
				c2=s.nextInt();}
				while (c2<1 || c2 >t3.size()) ;
						p=t3.get(c2-1);
						e.voter(p.getSymbole());
				System.out.println("Votre Vote a ete effectuer avec succees" );
				System.out.println(e.getChoix());}}
				else
				System.out.println("L'Electeur n'est pas Inscrit");}
				else 
				System.out.println("Pas de Partis Existant");
				break;
				case 5 : break;		
				default : System.out.println("SAISIR un Choix Compris entre 1 et 5  ");}}
			while (c!=5); break ; 
		
			case 2 : 
				
			do {
				int r; 
				Menu4();
				System.out.print("SAISIR UN CHOIX: ");
				c=s.nextInt();
				switch (c) {
				case 1 : 
				p=new Partis();	
				p.saisir();
				if(t3.contains(p)) 
				do {
				System.out.println("Parti Existante Voulez Vous Resaisir les Informations 1-Oui 0-Non ") ; r=s.nextInt();
				}while (r<0||r>1);
				else {
				t3.add(p);
				System.out.println("L Ajout a �t� effectuer");
				do {
				System.out.println("Voulez vous afficher La parti ? 1-Oui 0-Non"); r=s.nextInt();
				}while(r<0||r>1);
				if (r==1)
				p.afficher();}
				break;
				case 2 :
					if (t3.isEmpty()==false) {
					for(i=0;i<t3.size();i++) {
						p=new Partis();
						p=t3.get(i);
						System.out.println("Le Numero de Partis ="+ (i+1)); 
						p.afficher();}
					do {
					System.out.println("Saisir La partis a Modifier") ;
					choix1=s.nextInt() ; }
					while (choix1<1 || choix1>t3.size());
					p=t3.get(choix1-1);
					System.out.println("Voici La Partis a modifier ");
					p.afficher(); 
					System.out.println("======================");
					do {
					System.out.println(" 1- Modifier Le nom ") ; 
					System.out.println(" 2- Modifier Le nom Du president") ; 
					System.out.println(" 3- Modifier Le Symbole ") ; 
					System.out.println(" 4- Modifier Le Nombre d'adherents ") ;
					System.out.println("Saisir un Choix "); 
					c2=s.nextInt(); 
					}while (c2<1 && c2>4);
					switch (c2) {
					case 1 :
						do {
						System.out.println("Saisir Le Nouveau Nom du parti") ; 
						ch=s.next() ; 
						}while (Electeur.Lettre(ch)==false); 
						p.setNom(ch);
						System.out.println("La modification a ete effectuer ") ; 
						p.afficher(); break ; 
						
					case 2 :
						do {
						System.out.println("Saisir Le Nouveau Nom du president") ; 
						ch=s.next() ; 
						}while (Electeur.Lettre(ch)==false); 
						p.setPres(ch);
						System.out.println("La modification a ete effectuer ") ; 
						p.afficher(); break ;
					case 3 :
						do {
						System.out.println("Saisir Le Nouveau Symbole") ; 
						ch=s.next() ; 
						}while (Electeur.Lettre(ch)==false); 
						p.setSymbole(ch);
						System.out.println("La modification a ete effectuer ") ; 
						p.afficher(); break ;
						
					case 4 :
						do {
						System.out.println("Saisir Le Nouveau nombre d'adherents") ; 
						nbr=s.nextInt() ; 
						}while (nbr<0);
						p.setNb_adh(nbr);
						System.out.println("La modification a ete effectuer ") ; 
						p.afficher(); break ;
						
						default : System.out.println("Saisir un Choix Compris entre 1 et 4");}}
						else
							System.out.println("Aucun Parti existant ") ;break ; 
				case 3 : 
					Iterator<Partis> iter = t3.iterator(); 
					if(iter.hasNext()==true) {
					while (iter.hasNext()) {
						p=iter.next();
						p.afficher();}}
						else 
						System.out.println("Aucun Parti Existant ");break ; 
				case 4:
					if(t3.isEmpty()==false) {
					boolean verif=false ; 
					System.out.println("Saisir Le Symbole du Parti"); 
					ch=s.next();
					for(i=0;i<t3.size();i++) {
					p=new Partis() ; 
					p=t3.get(i);
					if (p.getSymbole().equals(ch)) {
					verif=true ; 
					p.afficher();break;}}
					if (verif==false)
					System.out.println("Veuillez Verifier Le symbole du parti") ;}
					else System.out.println("Pas de Partis Enregistrer") ; 
					break;
				case 5 : break ; 
				default:System.out.println("Verifier Votre Choix");break;}}
				while (c!=5); break ; 
			case 3 : 
				do {
					Menu3();
					System.out.print("SAISIR UN CHOIX: ");
					c=s.nextInt();
					switch (c) {
					case 1 :
						b=new Bureau();
						b.saisir();
						if (t2.indexOf(b)==-1)
						t2.add(b);
						else System.out.println("Bureau existant");
						break;
					
						case 2: 
							int i_bur; //indice bureau a modifier
							for ( i=0;i<t2.size();i++)
						{  System.out.print((i+1)+".  ");
							System.out.println(t2.get(i)); }
							do {
						System.out.println("Donner le numero du bureau a modifier");
						i_bur=s.nextInt();
							}while(i_bur<1 ||i_bur>t2.size()); 
							regionn x =new regionn();
							String []adr = new String [4];
							 for ( i = 0 ; i<=3;i++) {
								  System.out.println((i+1)+". "+adr[i]) ; }
							 
							  int y;
							do {
								  System.out.println("Selectionner Une Adresse ") ; 
								   y = s.nextInt();}while (y<1 || y>4) ;
							int y1;
							do {
								   System.out.println("donner le numero du bureau");
								   y1=s.nextInt() ;
								 } while (y1<1 || y1>5);
							for (i=0;i<t1.size();i++) //changer le bureau dans arrayList electeur
							 {if (t1.get(i).getB().equals(t2.get(i_bur-1)))
							 { t1.get(i).getB().setAdresse(adr[y-1]);
							 t1.get(i).getB().setNum(y1);
							 } 
							 }
						 t2.get(i_bur-1).setAdresse(adr[y-1]);
						 t2.get(i_bur-1).setNum(y1); 
						break ; 
							
					case 3: 
						for ( i=0;i<t2.size();i++)
						{ t2.get(i).afficher();}
						break;
					case 4 : 
						int nb_inscrit=0;
						for ( i=0;i<t2.size();i++)
						{ nb_inscrit=0;
						for ( j=0;j<t1.size();j++)
						{if(t1.get(j).getB().equals(t2.get(i)))
							nb_inscrit++;}	
						t2.get(i).afficher();
							System.out.print("Nombre d'inscrit est : "+nb_inscrit+"\n");
						}break;
							
					case 5 : 
						int nb_inscrit_vote;
						for ( i=0;i<t2.size();i++)
						{ nb_inscrit=0;
						  nb_inscrit_vote=0;
							for ( j=0;j<t1.size();j++)
						{ if(t1.get(j).getB().equals(t2.get(i)))
							{nb_inscrit++;
						if(t1.get(j).isSituation()==true)
							nb_inscrit_vote++;}
						}
							t2.get(i).afficher();
							System.out.println("Nombre d'inscrit est : "+nb_inscrit+" Nombre de ceux qui ont vote " +nb_inscrit_vote);
						}break;	
					case 6 : break ;
					default : System.out.println("SAISIR un Choix Compris entre 1 et 6  ");}
					}
					while (c!=6); 
				break ; 
				

			case 4 : 
				do {
				int [] T_res = new int [t3.size()];
				int i_max=0;
                int max;
				System.out.println("1. Afficher resultat global  ");
				System.out.println("2. Afficher resultat par bureau");
				System.out.println("3. Le vainqueur");
				System.out.println("4. Les partis qui ont minimum vote");
				System.out.println("5. Quitter");
				System.out.print("Donner un choix: ");
				c5=s.nextInt();
				switch (c5) {
			
				case 1 : t4.clear();
				for (i=0;i<t3.size();i++)
					T_res[i]=0;
                 for (i=0;i<t1.size();i++) // remplir arraylist avec les votes des electeurs 
                 { if (t1.get(i).isSituation())
                	 t4.add(t1.get(i).getChoix());
                 }
                 for (i=0;i<t3.size();i++)
                 { for (j=0;j<t4.size();j++)
                 { if (t3.get(i).getSymbole().equals(t4.get(j)))
                	 {
                	 T_res[i]++; 
                
                	 }
                 } 
                 
                 } 
              int occ1=0; 
              double occc1;
                 for (i=0;i<t3.size();i++)
                 { occ1=0;
                	 System.out.print(t3.get(i).getNom());
                	 for (j=0;j<t4.size();j++)
                	 {
                		 if (t4.get(j).equals(t3.get(i).getSymbole()))
                			 occ1++;
                	 }
                 
                  occc1=occ1*1.0;
                 System.out.println(" a eu comme pourcentage "+(occc1/t4.size()*100)+"% \n ------------------");
                	 
                 }
					
					break ; 
			case 2 :    // par bureau
				double occc;
				int occ=0;
				for (i=0;i<t2.size();i++)
				{ t4.clear();
				System.out.println("Le resultat pour le bureau "+t2.get(i)+"\n-----------------");
				
				
				 for (j=0;j<t1.size();j++) // remplir arraylist avec les votes des electeurs dans bureau i
                 { if (t1.get(j).isSituation() && t1.get(j).getB().equals(t2.get(i))) 
                	 //of verifie si l'electeur a vote && son choix = symbole du parti 
                	 {t4.add(t1.get(j).getChoix());} // si oui on ajoute son choix dans t4
                 }
				 
				for (int k=0;k<t3.size();k++)
				{ occ=0;
					for (int l=0;l<t4.size();l++)
				{ if (t3.get(k).getSymbole().equals(t4.get(l)))
					occ++; 
				}
				occc=occ*1.0;
				System.out.println("Le partie "+t3.get(k).getNom()+" a eu "+(occc/t4.size()*100)+"%");
					}
				
				    }
				break ; 
			case 3 :
				t4.clear();
				for (i=0;i<t3.size();i++)
					T_res[i]=0;
                 for (i=0;i<t1.size();i++) // remplir arraylist avec les votes des electeurs 
                 { if (t1.get(i).isSituation())
                	 t4.add(t1.get(i).getChoix());
                 }
                 for (i=0;i<t3.size();i++)
                 { for (j=0;j<t4.size();j++)
                 { if (t3.get(i).getSymbole().equals(t4.get(j)))
                	 {
                	 T_res[i]++; 
                
                	 }
                 } 
                 
                 }
                 i_max=0;
                 max=0;
                 for (i=0;i<t3.size();i++)
                 { if (T_res[i]>max)
                	  { max=T_res[i];
                	   i_max=i;
                	  } 	 
                 }
                 int occmax=0;
                 for (i=0;i<t3.size();i++)
                 { if (T_res[i]==max)
                     occmax++;                	 
                 }
                 double maxx=max*1.0; 
                  if (occmax==1)
                	 System.out.println("Le gagnant est ' "+t3.get(i_max).getNom()+" ' il a eu "+(maxx/t4.size()*100)+"%");
                 else if (occmax>1)
                 { System.out.println("Les gagnants sont : "); 
                 for (i=0;i<t3.size();i++)
                 { if (T_res[i]==max)
                	 System.out.println(t3.get(i));
                 }
                  
                 System.out.println("Avec un pourcentage = "+(maxx/t4.size()*100)+"%");
                	 
                 }
                  break ; 
			case 4 : 
				t4.clear();
				for (i=0;i<t3.size();i++)
					T_res[i]=0;
                 for (i=0;i<t1.size();i++) // remplir arraylist avec les votes des electeurs 
                 { if (t1.get(i).isSituation())
                	 t4.add(t1.get(i).getChoix());
                 }
                 for (i=0;i<t3.size();i++)
                 { for (j=0;j<t4.size();j++)
                 { if (t3.get(i).getSymbole().equals(t4.get(j)))
                	 {
                	 T_res[i]++; 
                
                	 }
                 } 
                 
                 } 
                 int i_min=0;
                 int min=T_res[0]; // on cherche le minimum
                 for (i=0;i<t3.size();i++)
                 { if (T_res[i]<min)
                	  { min=T_res[i];
                	   i_min=i;
                	  } 	 
                 }
                 occ=0;
                 for (i=0;i<t3.size();i++)
                 { if (T_res[i]==min)
                     occ++;                	 
                 }
                 double minn=min*1.0;
                 
                 if (occ==1)
                	 System.out.println("Le partie qui a eu minimum de vote est '"+t3.get(i_min).getNom()+"' avec "+min+" votes et "+(minn/t4.size()*100)+"%");
                 else if (occ>1)
                 { System.out.println("Les partis qui ont eu minimum de vote sont : "); 
                 for (i=0;i<t3.size();i++)
                 { if (T_res[i]==min)
                	 System.out.println(t3.get(i));
                 }
                  
                 System.out.println(" Avec un nombre de vote total ="+min+" ce qui donne "+(minn/t4.size()*100)+"%");
                	 
                 }
				
				break ; } } while (c5!=5);
			case 5 : break ; 
			default : System.out.println("SAISIR un Choix Compris entre 1 et 5  ");
			}} while(c1!=5);break; 
		 
		 case 2 : 
				
				do {
				Menu6(); 
				c4=s.nextInt(); 
				switch(c4) {
				case 1 : 
					double elect_voter=0,elect_inscri=0,res;
					for(i=0;i<t1.size();i++) {
						e=t1.get(i); 
					if(e.isSituation()==true)
						elect_voter++ ; 
					else if (e.isSituation()==false)
						elect_inscri++;}
					System.out.println("Total="+t1.size()); 
					System.out.println("Inscrit Et ils n'ont pas voter ="+elect_inscri); 
					System.out.println("Voter="+elect_voter);
					res=(elect_voter/t1.size())*100;
					System.out.println("Le Taux de Vote Global ="+res+"%");break;
				case 2 : 
					double stat=0;// Les Electeurs Qui ont Voter dans  Region (i)
					elect_inscri=0;//Les Electeurs Qui non Pas Voter Dans La Region(i)
					t5= regionn.getRegion();
					for(i=0;i<t5.length;i++) {
						elect_inscri=0;
						stat=0;
						for (j=0;j<t1.size();j++) {
							e=t1.get(j);
							if(e.getB().getRegion().equals(t5[i])){
								elect_inscri++;
							if  (e.isSituation()) 
								stat++;}}
						res=stat/elect_inscri; 
						if (elect_inscri==0) 
							System.out.println("Dans la region "+t5[i]+" il y a aucun electeur");
						else System.out.println("Le pourcentage de Vote Dans la Region " +t5[i]+ " = "+f.format((res)*100)+"%");
						}break;
				case 3:
					String [] region = regionn.getRegion(); 
					double [] taux =new double[5] ;
					double nb=0;
					for(i=0;i<5;i++) {nb=0;
					System.out.println("***********************") ;
					System.out.println ("La Region est ="+region[i]);
					System.out.println("***********************") ;
					for(int k=0;k<t1.size();k++) {
						e=new Electeur();
						e=t1.get(k);
						if (e.getB().getRegion().equals(region[i])) nb++;}
					for (j=0;j<t3.size();j++) {
					System.out.println(t3.get(j).getNom());  
					taux=calcule(region[i],t3.get(j).getSymbole(),t1);
					if (nb!=0) {
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
						+ " à la categorie d'age allant de 18 à 27 " +f.format((taux[4]/nb)*100)+ "%");
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 28 à 34 " +f.format((taux[3]/nb)*100)+ "%" );
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 35 à 44 " +f.format((taux[2]/nb)*100)+ "%" );
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 45 à 64 " +f.format((taux[1]/nb)*100)+ "%" );
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 65  plus  " +f.format((taux[0]/nb)*100)+ "%" );
					}
					else { System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 18 à 27	0 % ") ; 
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 28 à 34	0 % ") ;
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 35 à 44	0 % ") ;
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 45 à 64	0 % ") ;
					System.out.println("Les Electeurs qui ont voter pour cette parti appartenant"
							+ " à la categorie d'age allant de 60 à plus	0 % ") ;
					}}}break;
				
				case 4: 
					double bureau1=0,bureau2=0,bureau3=0,bureau4=0,bureau5=0;
					for( i=0;i<t3.size();i++) {
						bureau1=0;bureau2=0;bureau3=0;bureau4=0;bureau5=0;
						for( j=0;j<t1.size();j++) {
							e=new Electeur();
							e=t1.get(j);
							if (e.isSituation() && e.getChoix().equals(t3.get(i).getSymbole())) {
								if(e.getB().getNum()==1)
									bureau1++;
								if(e.getB().getNum()==2)
									bureau2++;
								if(e.getB().getNum()==3)
									bureau3++;
								if(e.getB().getNum()==4)
									bureau4++;
								else 
									bureau5++;}}
						
						System.out.println ("La parti "+t3.get(i).getNom()+" a eu le pourcentage de vote pour : ");
						System.out.println("Les Electeurs appartenant à la categorie d'age allant de plus 60 = "+(bureau1/t1.size())*100+"%");
						System.out.println("Les Electeurs appartenant à la categorie d'age allant de 45 à 64 = "+(bureau2/t1.size())*100+"%");
						System.out.println("Les Electeurs appartenant à la categorie d'age allant de 35 à 44 = "+(bureau3/t1.size())*100+"%");
						System.out.println("Les Electeurs appartenant à la categorie d'age allant de 28 à 34 = "+(bureau4/t1.size())*100+"%");
						System.out.println("Les Electeurs appartenant à la categorie d'age allant de 18 à 27 = "+(bureau5/t1.size())*100+"%");};break;
					
				case 5 : break ; 
				default:System.out.println("VEUILLEZ SAISIR UN CHOIX CORRECT ");break;
				}}while(c4!=5) ; 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 case 3 : System.out.println("Au revoir");break;
		default:System.out.println("VEUILLEZ VERIFIER VOTRE CHOIX  "); }}
		 while (c3!=3) ; }}
