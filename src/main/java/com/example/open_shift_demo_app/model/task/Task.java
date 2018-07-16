package com.example.open_shift_demo_app.model.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;



@Component
public class Task {

    private static final Logger logger = LoggerFactory.getLogger(Task.class);

    /** 何らかの定期実行処理 */
    @Scheduled(fixedDelay = 1000)
    public void doSomething() throws InterruptedException {

        logger.info("execute1 start {}", LocalDateTime.now().toString());
        Thread.sleep(5000);
        logger.info("execute1 end {}", LocalDateTime.now().toString());

    }

}
