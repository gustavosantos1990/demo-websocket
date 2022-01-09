package com.gtvs.demowebsocket.controller;

import com.gtvs.demowebsocket.model.Message;
import com.gtvs.demowebsocket.model.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class WebSocketController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) {
        System.out.println("message: " + message);
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        return new OutputMessage(message, time);
    }
}
