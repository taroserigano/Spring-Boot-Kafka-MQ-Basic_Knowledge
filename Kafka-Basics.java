KAFKA 

run Kafka by command 
separately, ru spring boot app 


Producer - Broker [Topics] - Consumer 


in Cluster, there are some Brokers
Each Broker has Topics, they're like DBs that
producers can send data to, and Consumers can get data from 



<Serializer>

convert to and from Java Object to JSON byte<> 


<TOPIC> 

-to see the msgs in topic, run the command: 
bin/kafka-console-consumer.sh --topic javaguides_json --from-beginning --bootstrap-server localhost:9092 ---> this will show the msgs in the javaguides_json topic 


BASIC SETTING

spring.kafka.producer.bootstrap-servers: localhost:9092
  
  // serialize before sending 
spring.kafka.producer.key-serializer: org.apache.kafka.common.serialization.StringSerializer
# spring.kafka.producer.value-serializer: org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer: org.springframework.kafka.support.serializer.JsonSerializer



spring.kafka.consumer.bootstrap-servers: localhost:9092
  // defint the cluster ID 
spring.kafka.consumer.group-id: myGroup
// usually, it's always earliest 
spring.kafka.consumer.auto-offset-reset: earliest

// deserialize before receiving the data 
spring.kafka.consumer.key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
#spring.kafka.consumer.value-deserializer: org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer: org.springframework.kafka.support.serializer.JsonDeserializer
spring.kafka.consumer.properties.spring.json.trusted.packages=*



spring.kafka.topic.name=javaguides
spring.kafka.topic-json.name=javaguides_json













