## 使用zookeeper,dubbo ,springboot 整合
     <!-- Spring Boot Dubbo 依赖 -->
            <dependency>
                <groupId>com.alibaba.spring.boot</groupId>
                <artifactId>dubbo-spring-boot-starter</artifactId>
                <version>2.0.0</version>
            </dependency>
            <!--zookeeper的客户端依赖-->
            <dependency>
                <groupId>com.101tec</groupId>
                <artifactId>zkclient</artifactId>
                <version>0.10</version>
            </dependency>
            <dependency>
                <groupId>org.apache.zookeeper</groupId>
                <artifactId>zookeeper</artifactId>
                <version>3.4.13</version>
                <exclusions>
                    <exclusion>
                        <groupId>org.slf4j</groupId>
                        <artifactId>slf4j-log4j12</artifactId>
                    </exclusion>
                    <exclusion>
                        <groupId>log4j</groupId>
                        <artifactId>log4j</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>
## dubbo配置文件
    ## Dubbo 服务提供者配置
    dubbo.registry.address=zookeeper://116.62.24.57:2181
    dubbo.application.name=bxhmall-manager-service
    dubbo.protocol.name=dubbo
    dubbo.protocol.port=20881
    dubbo.scan=com.bxh.bxhmallmanagerservice
    
    ## Dubbo 服务消费者配置
    dubbo.application.name=bxhmall-manager-web
    dubbo.registry.address=zookeeper://116.62.24.57:2181
    dubbo.protocol.name=dubbo
    dubbo.protocol.port=20881
    dubbo.scan=com.bxh.bxhmallmanagerweb
    
    ## 启动类上使用注解
    @EnableDubbo    
