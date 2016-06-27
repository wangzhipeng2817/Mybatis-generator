package client;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Created by wzp on 16-6-27.
 */
public class BaseClient {
    public Client client;
    public String ip;
    public Integer port;

    public BaseClient(String ip){
        this.ip = ip;
        this.client = ClientBuilder.newClient().register(JacksonJaxbJsonProvider.class);
    }

    public BaseClient(String ip, Integer port){
        this(ip);
        this.port = port;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        this.client.close();
    }
}
