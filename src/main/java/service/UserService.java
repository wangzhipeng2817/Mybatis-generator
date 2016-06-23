package service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import model.User;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by wzp on 16-6-23.
 */
@Path("/account")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Service("userService")
@Api(tags = "账户模块", description = "注册测试")
public class UserService {

    @Path("/user/{username}")
    @GET
    @ApiOperation(value = "注册用户", httpMethod = "GET", response = String.class )
    public String regist(@PathParam("username") @ApiParam(name = "用户名", required = false)String userName){
        System.out.println("这是一个service测试");
        return "success";
    }

    @Path("/regist")
    @POST
    @ApiOperation(value = "真*注册用户", httpMethod = "POST", response = String.class )
    public User regist(User user){
        System.out.println("这是一个regist测试");
        System.out.println(user.toString());
        return user;
    }
}
