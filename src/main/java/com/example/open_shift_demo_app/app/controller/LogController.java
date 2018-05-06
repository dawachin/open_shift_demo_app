package com.example.open_shift_demo_app.app.controller;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logger")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);

    @GetMapping("/change_file_path/{log_file_path}")
    public int setLogger(@RequestParam String log_file_path) {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        FileAppender<ILoggingEvent> testFileApp = (FileAppender<ILoggingEvent>)loggerContext.getLogger("ROOT").getAppender("APPLICATION_LOG_FILE");
        testFileApp.stop();
        testFileApp.setFile("log2/" + log_file_path + "/app.log");
        testFileApp.start();
        logger.info("ログの出力先を変更しました");
        return 1;
    }

    @GetMapping("/add_appender/{log_file_path}")
    public int addAppender(@RequestParam String log_file_path) {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

        FileAppender fileAppender = new FileAppender();
        fileAppender.setContext(loggerContext);
        fileAppender.setName("dynamic_file_path");
        fileAppender.setFile("log/" + log_file_path + "/app.log");

        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern("%-4relative [%thread] %-5level %logger{35} - %msg%n");
        encoder.start();

        fileAppender.setEncoder(encoder);
        fileAppender.start();
        loggerContext.getLogger("ROOT").addAppender(fileAppender);
        logger.info("ログの出力先を追加しました");

        return 1;
    }

    @GetMapping("/remove_appender")
    public int removeAppender() {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.getLogger("ROOT").detachAppender("dynamic_file_path");
        logger.info("ログの出力先を削除しました");
        return 1;
    }
}
