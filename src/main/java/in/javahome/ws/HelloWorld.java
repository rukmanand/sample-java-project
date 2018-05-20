package in.javahome.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	@WebMethod(exclude=false,operationName="myCustomMethod")
	public int add(@WebParam int i, @WebParam int j);
//    public DataHandler getImage();
}

