package in.javahome.ws;

import in.javahome.ws.request.Order;
import in.javahome.ws.request.OrderResponse;

import javax.activation.DataHandler;
import javax.jws.HandlerChain;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.soap.MTOM;

@WebService(targetNamespace="http://javahome.in/ws/order")
@SOAPBinding(style=Style.DOCUMENT,use=Use.ENCODED)
@MTOM
@HandlerChain(file="/demo_handlers.xml")
public interface IOrderService {
	public String placeOrder(Order order);
	@Oneway
	public Order getOrderById(int orderId);
	public OrderResponse getOrder(int orderId);
	
	public DataHandler getImage();
}
