package com.types.rest;
import com.types.dto.Message;
import com.types.service.interfaces.Imessanger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MessageController {
    @Autowired
    Map<String, Imessanger> services;
    
    @PostMapping("sendMessage")
    String sendMessage (@RequestBody Message msg){
        Imessanger service = services.get(msg.getType());
        /* for(Map.Entry<String, Imessanger> stringImessangerEntry : services.entrySet()) {
            System.out.println(stringImessangerEntry.getKey());
        } */ // just a test to check the keys of the Map.
        return service.sendMessage(msg);
    }
}
