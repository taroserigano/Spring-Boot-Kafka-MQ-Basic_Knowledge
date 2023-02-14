

-Basic setting 

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













