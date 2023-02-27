package internship;
import java.util.Scanner;

public class Railway1 extends User1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User1 u1=new User1();
		
		for (int i = 0; ; i++) {
			System.out.println("=============================");
			System.out.println("Create Account press 1");
			System.out.println("Display Account details 2");
			System.out.println("Reservation press 3");
			System.out.println("cancel Reservation press 4");
			System.out.println("cancel see Reservation 5");
			System.out.println("logout press 6");
			System.out.println("===============================");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter your name :");
				String name=sc.next();
				System.out.println("Enter your contact :");
				String contact=sc.next();
				char con='6';
				char con1='9';
				if (contact.charAt(0)>=con&&contact.charAt(0)<=con1) {
					u1.createAccount(name,contact);
					System.out.println("Account Created");
				}
				else {
					System.out.println("Please check your contact number !");
				}
				continue;
			}
			case 2:{
				System.out.println("Enter your contact :");
				String contact=sc.next();
				u1.displayAccountDetails(contact);
				continue;
			}
			case 3:{
				System.out.println("Enter your PNR Number !");
				String pnr=sc.next();
				System.out.println("Enter your nearest Railway Station");
				String from=sc.next();
				System.out.println("Enter Destination");
				String to=sc.next();
				u1.reservation(pnr, from, to);
				continue;
			}
			case 4:{
				System.out.println("Enter your PNR Number !");
				String pnr=sc.next();
				u1.cancelTrain(pnr);
				continue;
			}
			case 5:{
				System.out.println("Enter your PNR Number !");
				String pnr=sc.next();
				u1.bukedTrain(pnr);
				continue;
			}
			case 6:{
				System.out.println("Thanks for using our software");
				break;
			}
			
		}
	 break;
	}
	

}
}
