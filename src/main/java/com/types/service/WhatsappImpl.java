package com.types.service;

import com.types.dto.Message;
import com.types.service.interfaces.Imessanger;
import org.springframework.stereotype.Service;

@Service("whatsapp")
public class WhatsappImpl implements Imessanger {
    @Override
    public String sendMessage(Message msg) {
        return new String(msg.getText() + " message sent by " + msg.getName() + " via " + msg.getType());
    }
}
