package pl.edu.pbs.zaleznosci_lab5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagePrinter
{
    private final MessageProducer messageProducer; // zmieniony typ

    @Autowired
    public MessagePrinter(MessageProducer messageProducer)
    {
        this.messageProducer = messageProducer;
    }

    public void printMessage()
    {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }

}
