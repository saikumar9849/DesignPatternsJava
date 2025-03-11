package template;

public class PayToMerchant extends PaymentFlow {

	@Override
	public void validateRequest() {
		// Specific validation for PayToMerchant flow
		System.out.println("Validate logic of PayToMerchant");

	}

	@Override
	public void calculateFees() {
		// Specific Fee computation logic for PayToMerchant flow
		System.out.println("0% fees charged");
	}

	@Override
	public void debitAmount() {
		// debit the amount
		System.out.println("Debit the Amount logic of PayToMerchant");
	}

	@Override
	public void creditAmount() {
		// credit the amount logic
		System.out.println("Credit the full amount");

	}

}
