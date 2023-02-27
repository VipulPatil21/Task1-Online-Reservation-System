package internship;

public class User1 {

	
	
		String from;
		String to;
		String pnr;
		String train;
		Account1 a1=new Account1();
		User1(){}
		public void createAccount(String name,String contact) {
			if(contact.length()==10) {
				a1=new Account1(name,contact);
				this.pnr=name.charAt(0)+contact;
			}
			else {
				System.out.println("Please check your contact !");
			}
		}
		public void displayAccountDetails(String contact) {
			if (a1.contact.equals(contact)) {
				a1.displayAccount();
				System.out.println("your PNR is: "+pnr);
				
			} else {
				System.out.println("Check your details !");

			}
		}
		public void reservation(String pnr,String from,String to) {
			if(this.pnr.equals(pnr)) {
				this.from=from;
				this.to=to;
				this.train="SahyadriExpress";
				System.out.println("Your train is buked !");
			}
			else {
				System.out.println("Check your PNR number !");
			}
		}
		public void bukedTrain(String pnr) {
			if(this.pnr.equals(pnr)) {
			
				if(this.train!=null) {
				
					System.out.println(a1.name+" your train name is :"+this.train);
				}else {
					System.out.println(a1.name+" you not booked train yet !");
				}
			}
			else {
				System.out.println("please Enter correct PNR");
			}
		}
		public void cancelTrain(String pnr) {
			if(this.pnr.equals(pnr)) {
				this.train=null;
				System.out.println("Your train is cancelled !");
				System.out.println("your amounyt will be refund !");
			}
			else {
				System.out.println("Check your PNR number");
			}
		}
	}


