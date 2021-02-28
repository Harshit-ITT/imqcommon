package imq.protocol;

import imq.exception.IMQException;

public class IMQResponse extends IMQProtocol {

	private int status;
	private ResponseMessage message;
	private IMQException imqException;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public ResponseMessage getMessage() {
		return message;
	}

	public void setMessage(ResponseMessage message) {
		this.message = message;
	}

	public IMQException getImqException() {
		return imqException;
	}

	public void setImqException(IMQException imqException) {
		this.imqException = imqException;
	}

}
