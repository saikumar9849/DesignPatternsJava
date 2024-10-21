package chainofresponsibility;

public class ContentTypeHandler implements HandlerChain {
	String contentType;
	public HandlerChain next;

	public ContentTypeHandler(String contentType) {
		this.contentType = contentType;
	}

	@Override
	public String addhandler(String inputHeader) {
		String outputHeader = inputHeader + "\ncontentType: " + contentType;
		if (next == null) {
			return outputHeader;
		}
		return next.addhandler(outputHeader);
	}

}
