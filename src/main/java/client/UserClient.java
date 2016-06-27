package client;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by wzp on 16-6-27.
 */
public class UserClient extends BaseClient{

    private static final String prefix = "http://";

    private static final String targetUrl = "/practice/v1/account";

    public UserClient(String ip) {
        super(ip);
    }

    public UserClient(String ip, Integer port) {
        super(ip, port);
    }

    public String registService(String username){
        String serviceUrl = "/user";
        StringBuilder sb = new StringBuilder(prefix);
        String finalUrl = sb.append(this.ip).append(":").append(this.port).append(targetUrl).toString();
        try {
            Invocation.Builder builder = client.target(finalUrl).path(serviceUrl).path(username).request(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE);
            Response response = builder.get();
            String result = response.readEntity(new GenericType<String>(){});
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
