package template;

public class Client {
	public static void main(String[] args) {
		PaymentFlow payment = new PayToFriend();
		payment.sendMoney();
	}
}
