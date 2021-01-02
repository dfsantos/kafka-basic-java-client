# kafka-basic-java-client

Utilização da API Java para produtor e consumidor de eventos.

### Configurando o broker para conexões de clients

No arquivo ./config/server.properties do Kafka...

```shell
############################# Socket Server Settings #############################

# The address the socket server listens on. It will get the value returned from 
# java.net.InetAddress.getCanonicalHostName() if not configured.
#   FORMAT:
#     listeners = listener_name://host_name:port
#   EXAMPLE:
#     listeners = PLAINTEXT://your.host.name:9092
listeners=PLAINTEXT://localhost:9092
```

### Documentação base do produtor
https://kafka.apache.org/27/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html

### Documentação base do consumidor
https://kafka.apache.org/27/javadoc/index.html?org/apache/kafka/clients/consumer/KafkaConsumer.html

### Discussão sobre dependência jackson-databind
https://stackoverflow.com/questions/63714401/org-apache-kafka-common-errors-timeoutexception-topic-not-present-in-metadata-a
