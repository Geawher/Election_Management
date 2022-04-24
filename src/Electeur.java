import java.util.* ; 
public class Electeur {
	private String nom;
	private String  prenom;
	private String CIN ;
	private int age ; 
	private Bureau b; 
	private boolean situation;
	private String choix;
	
	public Electeur(String nom,String prenom ,String CIN,int age,Boolean situation,String choix,int num_b,String region ,String adr) {
		this.nom =nom;
		this.prenom = prenom;
		this.CIN = CIN;
		this.age = age;
		if (situation == true) {
		this.situation = situation;
		this.choix = choix;
		this.b=new Bureau (num_b,region,adr);}
	else {
		this.situation = false;
		this.choix = "";
		this.b=new Bureau ();}}

		
	public Electeur () {
		nom = "";
		prenom = "";
		CIN = "";
		age = 0;
		situation = false;
		choix = "";}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bureau getB() {
		return b;
	}
	public void setB(Bureau b) {
		this.b = b;
	}
	public boolean isSituation() {
		return situation;
	}
	public void setSituation(boolean situation) {
		this.situation = situation;
	}
	public String getChoix() {
		return choix;
	}
	public void setChoix(String choix) {
		this.choix = choix;
	}
	
	public static boolean Lettre(String ch ) {
		int i=0;
	while(i<ch.length() && Character.isLetter(ch.charAt(i)) ){
		i=i+1;}
		return i==ch.length();}
	public static boolean chiffre(String ch ) {
		int i=0;
	while(i<ch.length() && Character.isDigit(ch.charAt(i) )&& ch.length()==8){
		i=i+1;
		}
		return i==ch.length();}
	

	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Electeur)) {
			return false;
		}
		Electeur other = (Electeur) obj;
		return Objects.equals(CIN, other.CIN);
	}
	
	public void inscrire()
	{ 
		
		Scanner s = new Scanner (System.in);
		do {
		System.out.println("Saisir AGE ");
		age = s.nextInt();}
		while (age < 18 );
		do {
		System.out.println("Saisir Nom "); 
		nom = s.next();}
		while (Lettre(nom)==false ||  nom =="" );
		do {
		System.out.println("Saisir Prenom ");
		prenom = s.next();}
		while (Lettre(prenom)==false || prenom =="");
		do {
		System.out.println("Saisir CIN ");
		CIN = s.next();}
		while(chiffre(CIN)==false);
	b=new Bureau();
		regionn x=new regionn();
		String [] x1=new String[2];
		  x1= x.saisir(); 
			 b.setRegion(x1[0]);
			b.setAdresse(x1[1]);
		if (age>=65 && age <=90) 
			b.setNum(1);
		 else if (age>=45  && age <=64)
			 b.setNum(2); 
		 else if (age>=35 && age <=44 )
			 b.setNum(3);
		 else if(age >=28 && age <= 34) 
			 b.setNum(4);
		else
			b.setNum(5); 
	}
	
	
	
	@Override
	public String toString() {
		return  " nom=" + nom + ", prenom=" + prenom + ", CIN=" + CIN
				+ ", age=" + age + ", b=" + b + ", situation=" + situation ;
	}
	public void afficher() {
		System.out.println("Le  Nom est "+nom);
		System.out.println("Le  Prenom est "+prenom);
		System.out.println("Le  CIN est "+CIN );
		b.afficher();
		if (choix =="") {
		System.out.println("L'Electeur n'a pas encore Vote ");}
		else {
			System.out.println("L'Electeur a Vote ");
			}
	System.out.println("============================= ");
	
	}
	
	public boolean afficher_bureau (Bureau bir) {
	 if (b.equals(bir)) {
		 return true ; }
	 else 
		 return false ; }
	 
	 public boolean afficher_electeur(String cin) {
		 if (CIN.equals(cin)) {
			 return true ; }
		 else 
			 return false ;}
	 
	 public void voter (String s) {
		 if (age>=65 && age <=90) 
			b.setNum(1);
		 else if (age>=45  && age <=64)
			 b.setNum(2); 
		 else if (age>=35 && age <=44 )
			 b.setNum(3);
		 else if(age >=28 && age <= 34) 
			 b.setNum(4);
		else
			b.setNum(5);
		 choix=s;
		 situation = true ; }
	
		
}
	
	
	
