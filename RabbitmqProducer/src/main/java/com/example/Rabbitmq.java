package com.example;

import com.rabbitmq.client.*;
import com.rabbitmq.client.impl.AMQImpl;
import org.apache.ibatis.io.ResolverUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Rabbitmq {


    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory =  new ConnectionFactory();
        connectionFactory.setHost( "127.0.0.1" );
        connectionFactory.setPort( 5672 );
        connectionFactory.setUsername( "guest" );
        connectionFactory.setPassword( "guest" );
        connectionFactory.setVirtualHost( "/" );
        String text = " send a rabbit mq";
        try {
            Connection connection = connectionFactory.newConnection( );
            Channel channel = connection.createChannel( );

            channel.exchangeDeclare( "test2", BuiltinExchangeType.DIRECT, true, false, null );

            String queue1 = "queue1";
            String queue2 = "queue2";

            channel.queueDeclare( queue1, true, false, false, null );
            channel.queueDeclare( queue2, true, false, false, null );
            channel.queueBind( queue1, "test2", 2+"" );
            channel.queueBind( queue2, "test2", 3+"" );

            int i = 10;
            for (int i1 = 0; i1 < i; i1++) {
                String s = text + i1;

                System.out.println(s );

                channel.basicPublish( "test2", i1+"", null, s.getBytes( StandardCharsets.UTF_8 )  );

            }

            channel.close();
            connection.close(  );


        } catch (IOException e) {
            throw new RuntimeException( e );
        } catch (TimeoutException e) {
            throw new RuntimeException( e );
        }
    }
}
