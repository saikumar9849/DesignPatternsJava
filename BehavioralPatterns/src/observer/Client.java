package observer;

public class Client {

	public static void main(String[] args) {
		Editor editor = new Editor();
		EmailNotificationListener emailListener = new EmailNotificationListener();
		LogOpenListener logListener = new LogOpenListener();

		editor.events.subscribe("open", emailListener);
		editor.events.subscribe("save", emailListener);
		editor.events.subscribe("open", logListener);

		editor.openFile("test.png");
		editor.saveFile();

		editor.events.unSubscribe("save", emailListener);

		editor.openFile("test1.png");
		editor.saveFile();
	}

}
