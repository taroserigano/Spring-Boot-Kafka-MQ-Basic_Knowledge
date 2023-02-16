

*Config 

-set up Topic Builder w/ topic name 


*Producer 

-use KafkaTemplate 

-nonJSON 
--add topicName and message

-w/JSON 
--use Message<>, add payload and topicName in header 
--Message<> converts Object into JSON 


*Consumer 

-add @KafkaListener and add topic and groupId in parameters 

-create method consume(Str msg) 

*Controller
-use KafkaProducer.sendMessage(user)
