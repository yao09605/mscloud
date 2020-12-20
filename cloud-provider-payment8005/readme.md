# consul的作用
 - 服务发现：提供HTTP和DNS两种发现方式  
 - 健康监测：支持多种协议，HTTP、TCP、Docker、Shell脚本定制化
 - KV存储：key , Value的存储方式
 - 多数据中心：Consul支持多数据中心
 - 可视化Web界面

# 下载地址
[https://www.consul.io/downloads.html](https://www.consul.io/downloads.html)

# 说明书
[https://www.springcloud.cc/spring-cloud-consul.html](https://www.springcloud.cc/spring-cloud-consul.html)

# 怎么安装
1. 解压后把exe文件放在一个目录下如：C:\Program Files
2. 配置环境变量 Path中添加：`C:\Program Files`
3. Win+R， cmd 回车，输入`consul --version` 验证是否安装成功

# 开启开发者模式
命令行输入：`consul agent -dev`

# 可视化界面
访问： [http;//localhost:8500](http;//localhost:8500)