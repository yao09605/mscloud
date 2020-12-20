## 项目结构说明：
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