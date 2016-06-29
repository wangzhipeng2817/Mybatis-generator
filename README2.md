开发文档
--------------
目录
-----------
 * [代码结构](#代码结构)
 * [Client](#Client) 
 * [Core](#Core) 
 * [Message-Consumer](#Message-Consumer) 
 * [top-message-system](#top-message-system) 
<br>
<br>


代码结构
------------
#####1.Postman-Client
java部分开放的sdk模块,提供方便的入口调用服务
<br>
#####2.Postman-Core
项目中都support类,3方服务的一些核心接口API
<br>
#####3.Postman-Message-Consumer
用于消费消息,批量推送的模块
<br>
#####4.top-message-system
具体服务实现模块
 * commmon
    ONS服务的相关公共组件
 * message
    消息推送服务
 * user
    用户注册,查询相关服务
<br>

Client
-------------


Core
-------------

Message-Consumer
-------------

top-message-system
-------------

