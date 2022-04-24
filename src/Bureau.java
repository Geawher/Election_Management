import java.util.*;
public class Bureau { 
	private int num;
	private regionn x=new regionn();
	private String adresse ;
	private String region ;
 	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public Bureau() {
	 num=0;
		adresse="";
		 region="";
	}
	
	
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Bureau)) {
			return false;
		}
		Bureau other = (Bureau) obj;
		return Objects.equals(adresse, other.adresse) && num == other.num && Objects.equals(region, other.region);
	}
	public Bureau(int num, String region, String adresse) {
		super();
		this.num = num;
		this.adresse = adresse;
		this.region = region;
	}
	@Override
	public String toString() {
		return ("num: " + num + " adresse:" + adresse + " region :" + region  );
	} 
	 
	public static boolean Lettre(String ch ) {
		int i=0;
	while(i<ch.length() && (Character.isLetter(ch.charAt(i)) )){
		i=i+1;}
		return i==ch.length();}
	
	 public void saisir()
	    
	   { Scanner s= new Scanner (System.in);
		String [] x1=new String[2];
	  x1= x.saisir(); 
		 region = x1[0];
		 adresse = x1[1];
		 
		 
		   System.out.println("donner le numero du bureau");
		   num=s.nextInt() ; 
	   }
	   
	   public void afficher () 
	   { System.out.println("le numero de bureau est " +num);
	     System.out.println("la region de bureau est " +region);
	     System.out.println("l'adresse du bureau est " +adresse);
	     System.out.println("=============================");
	   }


}
