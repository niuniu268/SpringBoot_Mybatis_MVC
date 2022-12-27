# This repository is to illustrate how to apply RabbitMQ and address advanced issues concerning RabbitMQ
## docker
``` 
docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management

```
## Maven 
```
             <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
 ```
        
## Producer

1. create connection and channel
2. for "Hello world": exchange and routingkey can be ignored
3. for "publish/subscribe" takes into account exchange
4. for "routing" takes into account routingkey
5. for "topic" takes into account complicated routingkey
[Rabbit MQ Document](https://www.rabbitmq.com/getstarted.html)

## Consumer
1. RabbitmqDirect is for "hello word"
2. Rabbitmq1 and Rabbitmq2 for the rest of mq models

## PS: keep in mind BuiltinExchangeType
