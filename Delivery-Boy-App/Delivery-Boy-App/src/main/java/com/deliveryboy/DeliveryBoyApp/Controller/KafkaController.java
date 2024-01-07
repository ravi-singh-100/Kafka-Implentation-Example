package com.deliveryboy.DeliveryBoyApp.Controller;

import com.deliveryboy.DeliveryBoyApp.KafkaService.LocationUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class KafkaController {
    @Autowired
    private LocationUpdate locationUpdate;
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        locationUpdate.update("( "+Math.round(Math.random()*100 )+" , "+Math.round(Math.random()*100 )+" )");
    return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatusCode.valueOf(200));
    }
}
