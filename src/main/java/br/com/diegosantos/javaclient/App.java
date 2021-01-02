package br.com.diegosantos.javaclient;

public class App {

    public static void main(String[] args) {
        ProducerClient producer = new ProducerClient();
        producer.start();
        producer.produce("Second message");
        producer.close();

        ConsumerClient consumer = new ConsumerClient();
        consumer.start();
        consumer.consume();
    }

}
