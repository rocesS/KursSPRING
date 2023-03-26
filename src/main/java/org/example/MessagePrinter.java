package org.example;

import org.example.producaer.MessageProducer;
import org.springframework.stereotype.Service;

@Service
class MessagePrinter {
    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }

}
