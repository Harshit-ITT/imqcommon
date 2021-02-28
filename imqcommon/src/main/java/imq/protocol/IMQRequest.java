package imq.protocol;

public class IMQRequest extends IMQProtocol {

	RequestType requestType;

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

}
