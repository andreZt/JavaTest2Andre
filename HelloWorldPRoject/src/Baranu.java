
public class Baranu extends People implements StyleForBaran {
			
	Baranu(){
		super();
	}
		
		
	void showPeople() {
		System.out.println("Baran Name: "+ nameP +" Age: " + oldP +" Adres: "+ adres + " "+ GreateBaran());
		
	}	
	
	public String GreateBaran() {
		if ( oldP > 15 ) {
			return " - Greate Baran!!!";
		}
		return "";
	}
}


