package com.example;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitmqDirect {
    static ConnectionFactory connectionFactory = new ConnectionFactory();

    public static void main(String[] args) throws IOException, TimeoutException {
        connectionFactory.setHost( "127.0.0.1" );
        connectionFactory.setPort( 5672 );
        connectionFactory.setUsername( "guest" );
        connectionFactory.setPassword( "guest" );
        connectionFactory.setVirtualHost( "/" );

        Connection connection = connectionFactory.newConnection( );
        Channel channel = connection.createChannel( );
        channel.queueDeclare( "directqueue", false, false, false, null );

        DeliverCallback deliverCallback =  new DeliverCallback( ) {
            @Override
            public void handle(String consumerTag, Delivery message) throws IOException {
                String delivery =  new String(message.getBody(), "UTF-8");
            }
        };

        Consumer consumer = new DefaultConsumer( channel  ){



            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {

                System.out.println(consumerTag );
                System.out.println("----------" );
                System.out.println(envelope );
                System.out.println("----------" );
                System.out.println(properties );
                System.out.println("----------" );
                System.out.println(new String( body) );

            }
        };

        String directQueue = channel.basicConsume( "directqueue", true, consumer );
        System.out.println(directQueue );

    }
}
