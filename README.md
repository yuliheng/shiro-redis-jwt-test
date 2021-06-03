# shiro-redis-jwt-test

这个小demo是自己做测试用的，参考了 项目：https://github.com/zhangdaiscott/jeecg-boot.git

基础框架：Spring Boot 2.3.5.RELEASE

持久层框架：Mybatis-plus 3.4.1

安全框架：Apache Shiro 1.7.0，Jwt 3.11.0

数据库连接池：阿里巴巴Druid 1.1.22

缓存框架：redis

思路：会将用户token保存进redis,并设置失效时间，利用redis机制保证数据的时效性；例如：5分钟；如果失效之前一直在访问，则失效时间自动后延；5分钟内没有访问则token失效，提示重新登录；
