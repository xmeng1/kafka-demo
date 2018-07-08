package science.mengxin.java.kafka.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface ProducerChannel {
    String CHANNEL = "messageChannel";

    @Output
    MessageChannel messageChannel();
}
