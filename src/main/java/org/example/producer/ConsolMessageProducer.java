package org.example.producer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@Profile("console")
class ConsolMessageProducer implements MessageProducer {
    private final Scanner scanner;

    public ConsolMessageProducer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolny teks:");
        return scanner.nextLine();
    }
}
