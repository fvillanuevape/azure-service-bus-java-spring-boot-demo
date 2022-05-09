package pe.com.fvillanueva.azureservicebusjavaspringbootdemo;

import com.azure.messaging.servicebus.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("servicebus")
public class ControllerServiceBus {

    private String connectionString = "<NAMESPACE CONNECTION STRING>";
    private String queueName = "<QUEUE NAME>";

    // Send Message
    @PostMapping
    public String sendMessage(@RequestBody String messages){
        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
                .connectionString(connectionString)
                .sender()
                .queueName(queueName)
                .buildClient();

        // send one message to the queue
        senderClient.sendMessage(new ServiceBusMessage(messages));
        senderClient.close();
        return "Accept";
    }
}
