package com.deliveryboy.DeliveryBoyApp.Config;

import org.apache.kafka.clients.admin.NewTopic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {
    @Bean
    public NewTopic createNewTopic(){
        return TopicBuilder.name(Const.LOCATION_TOPIC_NAME)
//                .replicas()
//                .partitions()
                .build();
    }
}
