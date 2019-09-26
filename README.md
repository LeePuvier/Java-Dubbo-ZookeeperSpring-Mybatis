# Java-Dubbo-ZookeeperSpring-Mybatis
Java-Dubbo-ZookeeperSpring-Mybatis

参考地址: <u> https://www.cnblogs.com/gaopengfirst/p/9555240.html </u>

# 一、ZooKeeper

- - -

# 二、Mysql

- - -

# 三、Redis

- - -

# 四、配置

- - -

# 五、zooKeeper命令行

## 1. 进入根目录/bin 
    
## 2. ./zkCli.sh -server IP:Port
    
## 3. 查看指定内容

- ls /
 
>![终端展示](./dubbo-client/images/zk_ls.png)
    
- ls /dubbo
   
>![终端展示](./dubbo-client/images/zk_ls_dubbo_.png)

- ls /dubbo/com.leepuvier.dubbo.common.service.UserService
   
>![终端展示](./dubbo-client/images/zk_ls_dubbo_service.png)  

- ls /dubbo/com.leepuvier.dubbo.common.service.UserService/consumers
    
>![终端展示](./dubbo-client/images/zk_ls_dubbo_service_consumer.png) 
  
- ls /dubbo/com.leepuvier.dubbo.common.service.UserService/providers
       
- ls /dubbo/com.leepuvier.dubbo.common.service.UserService/routers
       
- ls /dubbo/com.leepuvier.dubbo.common.service.UserService/configurators
   
- ls /zookeeper
    
- - -

# 六、Telnet连接Dubbo服务

## 常用命令

- 连接服务：telnet 127.0.0.1:8081

- 查看服务列表：ls

- 查看服务中的接口：ls **Service

- invoke调用服务接口：invoke 接口名称(Json格式出入参数)