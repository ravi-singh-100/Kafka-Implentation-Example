package com.deliveryboy.DeliveryBoyApp.KafkaService;

import com.deliveryboy.DeliveryBoyApp.Config.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationUpdate {
    private Logger logger= LoggerFactory.getLogger(LocationUpdate.class);
    @Autowired
    KafkaTemplate<String,String>kafkaTemplate;
    public boolean update(String location){
        kafkaTemplate.send(Const.LOCATION_TOPIC_NAME,location);
        logger.info("Location updated");
   return true;
    }
}
