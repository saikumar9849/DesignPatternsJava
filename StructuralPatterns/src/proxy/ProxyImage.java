package proxy;

public class ProxyImage implements Image {
	private String filename;
	private RealImage realImage;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		System.out.println("Proxy Image: displaying " + filename);
		if (realImage == null) {
			realImage = new RealImage(filename);
		}
		realImage.display();
		System.out.println("Proxy Image: logging " + realImage);
	}

}
