package template;

public class PayToFriend extends PaymentFlow {

	@Override
	public void validateRequest() {
		// Specific validation for PayToFriend flow
		System.out.println("Validate logic of PayToFriend");

	}

	@Override
	public void calculateFees() {
		// Specific Fee computation logic for PayToFriend flow
		System.out.println("0% fees charged");
	}

	@Override
	public void debitAmount() {
		// debit the amount
		System.out.println("Debit the Amount logic of PayToFriend ");
	}

	@Override
	public void creditAmount() {
		// credit the amount logic
		System.out.println("Credit the full amount");

	}

}
