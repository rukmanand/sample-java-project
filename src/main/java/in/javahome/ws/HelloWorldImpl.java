
package in.javahome.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "in.javahome.ws.HelloWorld",targetNamespace="http://javahome.in/ws")
public class HelloWorldImpl implements HelloWorld {
	
	
    public int add(int i, int j) {
        return i+j;
    }
    
   /* public DataHandler getImage(){
    	DataSource ds = new FileDataSource("C://Hari//Calculator.java");
    	DataHandler dh = new DataHandler(ds);
    	return dh;
    }*/
}

