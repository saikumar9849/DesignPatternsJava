package Bridge;

public class Instagram implements App {
	private PhoneOS os;

	public Instagram(PhoneOS os) {
		this.os = os;
	}

	@Override
	public void runApp() {
		System.out.println();
		os.display("Cached data");
		os.download("instagram.com");
		os.display("Instagram data");
		os.display("Fresh data");
		System.out.println();
	}

}
