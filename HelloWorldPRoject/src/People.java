import java.util.Scanner;


public abstract class People {
	String nameP;
	int oldP;
	String adres;
	
	People() {
		Scanner inscan = new Scanner(System.in);
		System.out.println("Enter name: ");
		nameP = inscan.next();
		System.out.println("Enter age: ");
		oldP = inscan.nextInt();
		System.out.println("Enter adres: ");
		adres = inscan.next();
	}
	
	abstract void showPeople();
}
