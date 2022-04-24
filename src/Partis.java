import java.util.*;
public class Partis { 
		
	public Partis(String nom, String pres, String symbole, int nb_adh) {
		this.nom = nom;
		this.symbole = symbole;
		this.pres = pres;
		this.nb_adh = nb_adh;
	}

	public Partis () {
		this.nom ="";
		this.symbole = "";
		this.pres = "";
		this.nb_adh = 0;
	}
	

	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Partis)) {
			return false;
		}
		Partis other = (Partis) obj;
		return Objects.equals(nom, other.nom) || Objects.equals(pres, other.pres)
				|| Objects.equals(symbole, other.symbole);
	}
	public boolean equals(String ch) {//la Surchage du methode equals selon le Symbole
		if (symbole.equals(ch))
			return true ; 
		else 
			return false ; }
	
	private String nom ; 
	private String symbole ; 
	private String pres ;
	private int nb_adh;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSymbole() {
		return symbole;
	}
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	public String getPres() {
		return pres;
	}
	public void setPres(String pres) {
		this.pres = pres;
	}
	public int getNb_adh() {
		return nb_adh;
	}
	public void setNb_adh(int nb_adh) {
		this.nb_adh = nb_adh;
	}
	
	
	public void saisir()
	{
		Scanner s = new Scanner(System.in); 
		do { 
			System.out.println("Saisir Le nom du Parti"); 
			nom=s.next(); }
		while (Electeur.Lettre(nom)==false ||  nom =="" ); 
		do { 
			System.out.println("Saisir Le nom du President "); 
			pres=s.next(); }
		while (Electeur.Lettre(pres)==false ||  pres =="" ); 
		do { 
			System.out.println("Saisir Le Symbole du parti"); 
			symbole=s.next(); }
		while (Electeur.Lettre(symbole)==false ||  symbole =="" ); 
		do { 
			System.out.println("Saisir le Nombre des Adherents "); 
			nb_adh=s.nextInt(); }
			while (nb_adh<=0); 
	}
	
	public void modifier_nom(String nom  ) { 
		this.nom = nom ; 
	}
	 
	public void modifier_pres(String pres) {
		this.pres=pres;
	}
	public void modifier_nombre(int nbr) {
	this.nb_adh=nbr;}
	public void modifier_symbole (String symbole) {
		this.symbole=symbole ; 
	}

	
	
	public void afficher () { 
		System.out.println("Le  Nom du parti  = "+nom);
		System.out.println("Le  nom du President = "+pres);
		System.out.println("Le  Symbole  = "+symbole );
		System.out.println("Le  Nombre d'adherents =  " +nb_adh );
		System.out.println("====================================");} 
		
	public void afficher_symbole ( String s) {
		if (s==symbole) {
			afficher();}} 
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
