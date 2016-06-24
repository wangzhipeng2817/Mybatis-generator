package model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import springLearn.model.annotation.Base;

/**
 * Created by wzp on 16-6-23.
 */
@Base(value = "user")
@ApiModel(value = "用户模型")
public class User {
    @ApiModelProperty(value = "用户名", example = "wzp", required = true)
    private String userName;
    @ApiModelProperty(value = "密码", example = "123")
    private String password;
    @ApiModelProperty(value = "年龄")
    private Integer Age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("   用户名:").append(this.getUserName());
        builder.append("   密码:").append(this.getPassword());
        builder.append("   年龄:").append(this.getAge());
        return builder.toString();
    }

}
