package mediator;

public class ChatUser {
	String name;
	Mediator mediator;

	public ChatUser(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public void sendMessage(String message) {
		System.out.println(name + ": sending Message " + message);
		mediator.sendMessage(message, this);
	}

	public void recieveMessage(String message) {
		System.out.println(name + ": recieved Message " + message);
	}
}
