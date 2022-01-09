package com.gtvs.demowebsocket.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutputMessage extends Message {

    private String time;

    public OutputMessage(Message message, String time) {
        super(message.getText(), message.getFrom());
        this.time = time;
    }
}
