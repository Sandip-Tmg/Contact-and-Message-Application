import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		ArrayList<String> names= new ArrayList<>();
		names.add("Jhon");
		names.add("Lyon");
		
		Contacts contacts= new Contacts(names);
		
		System.out.println("##Welcome to Contact and Message Application##");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		int input;
		System.out.println("1. Manage Contacts \n2. Messsage \n3. Exit");
		input=scanner.nextInt();
		
		if(input==1) {
			
			int contactInput;
			do {
				System.out.println("\n1. Show all contacts \n"
					+ "2. Add a new contact\n"
					+ "3. Search for a contact\n"
					+ "4. Delete a contact\n"
					+ "5. Go back to the previous menu");
				System.out.println();
				contactInput=scanner.nextInt();
			 
			 	if(contactInput==1) {
					contacts.showContacts();
				}else if(contactInput==2) {
					contacts.addContacts();
				}else if(contactInput==3) {
					contacts.searchContacts();
				}else if(contactInput==4) {
					contacts.deleteContacts();
				}
			 	
			}while(contactInput!=5);
			
			
		}
			
		System.out.println("1. Manage Contacts \n2. Messsage \n3. Exit");
		input=scanner.nextInt();
		
		
			
		
		
		
		
	
		

	}
	

}
