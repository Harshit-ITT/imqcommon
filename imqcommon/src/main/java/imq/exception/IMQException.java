package imq.exception;

public class IMQException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;
	
	public IMQException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}
