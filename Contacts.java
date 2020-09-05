import java.util.ArrayList;
import java.util.Scanner;

public class Contacts implements contactFunction{
	
	Scanner scanner = new Scanner(System.in);
	
	private ArrayList<String> names;

	public Contacts(ArrayList<String> names) {
		this.names = names;
	}

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	@Override
	public void showContacts() {
      System.out.println("Contacts are: "+this.names);		
	}

	@Override
	public void addContacts() {
		System.out.println("Please enter contact name");
		String name=scanner.next();
		names.add(name);	
		System.out.println("Contacts are: "+this.names);
	}

	@Override
	public void searchContacts() {
		System.out.println("Enter contact name you are looking for");
		String name=scanner.next();
		if(names.contains(name)) {
			System.out.println(name);
		}		
	}

	@Override
	public void deleteContacts() {
		System.out.println("Enter contact name you want to delete");
		String name=scanner.next();
		names.remove(name);
		System.out.println("New Contact: "+this.names);
	}
	
	
	
}
