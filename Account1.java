package internship;

public class Account1 {


		String name;
		String contact;
		Account1(){}
		Account1(String name,String contact){
			this.name=name;
			this.contact=contact;
		}
		void displayAccount() {
			System.out.println("Name is: "+name);
			System.out.println("Contact is: "+contact);
		}

	}


