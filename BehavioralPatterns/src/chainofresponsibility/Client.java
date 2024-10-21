package chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		AuthenticationHandler auth = new AuthenticationHandler("12345");
		ContentTypeHandler type = new ContentTypeHandler("json");
		payloadHandler payload = new payloadHandler("Boady: {\"username\" = \"jhon\"}");

		auth.next = type;
		type.next = payload;

		String withAuthentication = auth.addhandler("Headers with authentication");
		System.out.println(withAuthentication);

		System.out.println();
		String withoutAuthentication = type.addhandler("Headers with out Authentication");
		System.out.println(withoutAuthentication);
	}

}
