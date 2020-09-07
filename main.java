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
			manageContact(contacts);
		}else if(input==2) {
			
			ArrayList<String> texts= new ArrayList<>();
			texts.add("Hi Michael! How are you? Call me when you are free.");
			texts.add("Michael can we go for a hiking next week?");
			texts.add("Michael have you finished your programming assignments?");
			
			Message message = new Message(texts);
			
			
			int messageInput;
			
			do {
				System.out.println();
				System.out.println("1. See the list of all messages \n"
				+ "2. Send a new message\n"
				+ "3. Go back to the previous message");
				messageInput=scanner.nextInt();
				if(messageInput==1) {
				message.messageLists();
				}
			
			}while(messageInput!=3);
			
		}
		
//			If the user enters 5 we will go back to this menu 
		System.out.println("1. Manage Contacts \n2. Messsage \n3. Exit");
		input=scanner.nextInt();
		
	}
	
	public static void manageContact(Contacts contacts) {
		
		Scanner scanner = new Scanner(System.in);
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
	

}
