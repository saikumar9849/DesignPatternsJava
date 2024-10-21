package chainofresponsibility;

public class payloadHandler implements HandlerChain {
	String payload;
	public HandlerChain next;

	public payloadHandler(String payload) {
		this.payload = payload;
	}

	@Override
	public String addhandler(String inputHeader) {
		String outputHeader = inputHeader + "\n" + payload;
		if (next == null) {
			return outputHeader;
		}
		return next.addhandler(outputHeader);
	}

}
