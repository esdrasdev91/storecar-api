package com.webcar.storecar.message;

import com.webcar.storecar.dto.CarPostDTO;
import com.webcar.storecar.service.CarPostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerMessage {

    private final Logger LOG = (Logger) LoggerFactory.getLogger(KafkaConsumerMessage.class);

    @Autowired
    private CarPostService carPostService;

    @KafkaListener(topics = "car-post-topic", groupId = "store-posts-group")
    public void listening(CarPostDTO carPost) {

        LOG.info("Received Car Post Information: {}", carPost);
        carPostService.newPostDetails(carPost);

    }
}
