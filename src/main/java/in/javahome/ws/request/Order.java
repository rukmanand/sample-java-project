package in.javahome.ws.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	private int orderId;
	private int itemId;
	private String itemName;
	private Double cost;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemId=" + itemId
				+ ", itemName=" + itemName + ", cost=" + cost + "]";
	}
	
}
