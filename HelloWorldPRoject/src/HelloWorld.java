import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
			
		Scanner inscan = new Scanner(System.in);
		
		System.out.println("How many people???? : ");
		
		int Num;
		Num = inscan.nextInt();
		
		People a[] = new People[Num];
		
		for(int i=0; i<Num; i++) {
			System.out.println("Do you Enter a Friend? say 'yes' or 'no'  ");
			String typePeople = new String(inscan.next()); 
			
			if (typePeople.equals("Yes") ) {
				a[i] = new Friends();
			}
			else{
				a[i] = new Baranu();
			}
		}
		
		for(People q : a) {
			q.showPeople();
		}
	}
}

