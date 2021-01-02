package br.com.diegosantos.javaclient;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

import static org.apache.kafka.clients.producer.ProducerConfig.*;

public class ProducerClient {

    private Properties props;
    private Producer<String, String> producer;

    public void start() {
        props = new Properties();
        props.put(BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ACKS_CONFIG, "1");
        props.put(KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    }

    public void produce(final String message) {
        producer = new KafkaProducer<>(props);
        producer.send(new ProducerRecord<>("my-topic", "key", message));
        producer.flush();
    }

    public void close() {
        producer.close();
    }

}
