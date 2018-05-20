package in.javahome.ws;

import java.util.HashMap;
import java.util.Map;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import in.javahome.ws.request.Order;
import in.javahome.ws.request.OrderResponse;

public class OrderService implements IOrderService {
	Map<Integer, Order> orders = new HashMap<Integer, Order>();

	public String placeOrder(Order order) {
		String s = null;
		s.toCharArray();
		System.out.println(order.toString());
		orders.put(order.getOrderId(), order);
		return "Order Successfuly placed";
	}

	public Order getOrderById(int orderId) {
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orders.get(orderId);
	}
	
	public OrderResponse getOrder(int orderId){
		OrderResponse resp = new OrderResponse();
		Order order = orders.get(orderId);
		if(order != null){
			resp.setOrder(order);
			resp.setStatusCode("SUCCESS");
			return resp;
		}
		resp.setStatusCode("Failure : Order not Found");
		return resp;
	}
	
	public String updateOrder(Order order) {
		System.out.println(order.toString());
		orders.put(order.getOrderId(), order);
		return "Order Successfuly Updated";
	}

	@Override
	public DataHandler getImage() {
		FileDataSource source = new FileDataSource("C://hari.pdf");
		DataHandler handler = new DataHandler(source);
		return handler;
	}

}
