package com.example.open_shift_demo_app.app.logging;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;

public class MyTimeBasedRollingPolicy extends TimeBasedRollingPolicy<ILoggingEvent> {

    public MyTimeBasedRollingPolicy(){
        super();
        setFileNamePattern(getPattern());
    }

    private String getPattern(){
        // ここでファイル名パターンを作成する.
        return "log2/testFile.log.%d{yyyy-MM-dd}.log";
    }
}
