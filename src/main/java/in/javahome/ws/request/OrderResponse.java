package in.javahome.ws.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderResponse {
	private Order order;
	private String statusCode;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
}
