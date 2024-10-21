package observer;

public class Editor {
	public EventManager events = new EventManager("save", "open");
	String file = "";

	void openFile(String fileName) {
		this.file = fileName;
		this.events.notify("open", file);
	}

	void saveFile() {
		if (file != "") {
			events.notify("save", file);
		}
	}
}
