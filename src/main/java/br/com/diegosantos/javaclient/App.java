package br.com.diegosantos.javaclient;

public class App {

    public static void main(String[] args) {
        System.out.println("Application started");

        ProducerClient producer = new ProducerClient();
        producer.start();
        producer.produce("Message");
        producer.close();

        ConsumerClient consumer = new ConsumerClient();
        consumer.start();
        consumer.consume();

        System.out.println("Application finished");
    }

}
