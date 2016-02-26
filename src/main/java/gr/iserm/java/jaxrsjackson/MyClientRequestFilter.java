package gr.iserm.java.jaxrsjackson;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * Created by sermojohn on 26/2/2016.
 */
public class MyClientRequestFilter  implements ClientRequestFilter{
    public MyClientRequestFilter() { }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        System.out.println("request was filtered...");
    }
}
