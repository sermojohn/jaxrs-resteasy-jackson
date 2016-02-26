package gr.iserm.java.jaxrsjackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import gr.iserm.java.jaxrsjackson.pojos.JsonOutput;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by sermojohn on 25/2/2016.
 */
public class Main {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JacksonModule());

        ResteasyJackson2Provider resteasyJackson2Provider = new ResteasyJackson2Provider();
        resteasyJackson2Provider.setMapper(objectMapper);

        Client client = ClientBuilder.newClient()
                .register(MyClientRequestFilter.class)
                .register(resteasyJackson2Provider)
                ;

        System.out.println(client.target("http://localhost:8080/").path("sample.json").request().get(JsonOutput.class));
    }
}

