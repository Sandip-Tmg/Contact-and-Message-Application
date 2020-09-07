import java.util.ArrayList;

public class Message implements messageFunction {
	
	private ArrayList<String> messages;

	public Message(ArrayList<String> messages) {
		this.messages = messages;
	}

	public ArrayList<String> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}

	@Override
	public void messageLists() {
		int counter=1;
		for(int i=0;i<messages.size();i++) {
			System.out.println(counter +") "+ messages.get(i));
			counter++;
		}
		
	}

	@Override
	public void sendMessage() {
		
		
	}
	
	
	
	
	

}
