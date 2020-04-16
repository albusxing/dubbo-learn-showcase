
# Dubbo 学习项目

### 任务列表

 * [x]  消费者和提供者直接 
 * [x]  使用 Zookeeper 注册中心
 * [x]  Dubbo 多版本控制 
 * [x]  Dubbo 服务分组
 * [ ]  Dubbo Admin 监控平台
 * [ ]  Spring Boot 中使用 Dubbo
 * [ ]  Dubbo 中如何使用 REST
 


### 01 消费者和提供者直接

在开发及测试环境下，经常需要绕过注册中心，只测试指定服务提供者，这时候可能需要点对点直连。
点对点直连方式，将以服务接口为单位，忽略注册中心的提供者列表，A 接口配置点对点，不影响 B 接口从注册中心获取列表。

消费者采用点对点直连式访问提供者。该方式会使提供者地址直接暴露给了消费者，降低了提供者的安全性。

参考：[直连提供者](http://dubbo.apache.org/zh-cn/docs/user/demos/explicit-target.html)


### 02 zookeeper 注册中心
Dubbo 推荐使用 Zookeeper 注册中心。
Dubbo 支持 zkclient 和 curator 两种 Zookeeper 客户端实现。
但是在 2.7.x 的版本中已经移除了 zkclient 的实现，如果要使用 zkclient 客户端，需要自行拓展。

参考：[Zookeeper注册中心](http://dubbo.apache.org/zh-cn/docs/user/references/registry/zookeeper.html)


### 03 多版本控制

当一个接口实现，出现不兼容升级时，可以用版本号过渡，版本号不同的服务相互间不引用。

### 04 服务分组

当一个接口有多种实现时，可以用 group 区分，不同的分组之间可以相互引用。

### Dubbo 中如何使用 REST

参考：[在 Dubbo 中开发 REST 风格的远程调用](https://dubbo.apache.org/zh-cn/docs/user/rest.html)

### 如何在 Spring Boot 中使用 Dubbo


### dubbo-admin 监控平台




 
  
