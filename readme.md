# 项目结构说明：
- cloud-api-commons 公共资源，entities
- cloud-consumer-order80 订单系统，支付服务的消费者，使用8080端口，（80端口打不开我也不知道为什么）
- cloud-provider-payment8001 支付服务的提供者之一，作为集群的一部分使用8001端口，注册在eureka服务器上
- cloud-provider-payment8002 支付服务的提供者之二，作为集群的一部分使用8002端口，注册在eureka服务器上
- cloud-eureka-server7001 eureka服务器集群之一，提供服务注册服务，使用7001端口，与cloud-eureka-server7002共同组成注册中心集群
- cloud-eureka-server7002 eureka服务器集群之一，提供服务注册服务，使用7002端口，与cloud-eureka-server7001共同组成注册中心集群
- cloud-provider-payment8004 支付服务的提供者之一，作为集群的一部分使用8004端口，注册在zookeeper服务器上，由于zookeeper太难装了，
  这个还没弄好
  
- cloud-provider-payment8005 支付服务的提供者之一，作为集群的一部分使用8004端口，注册在consul服务器上
- cloud-consumerconsul-order80 支付服务8005的消费者，同样注册在consul上。

# 有用的网址：
 - springboot源码： [https://github.com/spring-projects/spring-boot/releases/](https://github.com/spring-projects/spring-boot/releases/)
 - springboot 2 新特性： [https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes)
 - springcloud 源码： [https://github.com/spring-projects/spring-cloud/wiki](https://github.com/spring-projects/spring-cloud/wiki)
 - springcloud 官网： [https://spring.io/projects/spring-cloud](https://spring.io/projects/spring-cloud)
 - springcloud H版文档： [https://cloud.spring.io/spring-cloud-static/Hoxton.SR1/reference/htmlsingle/](https://cloud.spring.io/spring-cloud-static/Hoxton.SR1/reference/htmlsingle/)
 - springcloud 中文文档：[https://www.bookstack.cn/read/spring-cloud-docs/docs-index.md](https://www.bookstack.cn/read/spring-cloud-docs/docs-index.md)
 - springboot 官方文档： [https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/)