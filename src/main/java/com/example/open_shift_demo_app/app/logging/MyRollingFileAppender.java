package com.example.open_shift_demo_app.app.logging;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.TriggeringPolicy;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;

import javax.validation.constraints.NotNull;

public class MyRollingFileAppender extends RollingFileAppender<TriggeringPolicy<ILoggingEvent>>{

    private String filePath = "log2/testFile.log";

    public MyRollingFileAppender(){
        super();
        setFile(getFileName());
    }

    @NotNull
    private String getFileName(){
        // ここでファイル名を作成する.
        String MDCPath = MDC.get("log_file_path");
        if (!StringUtils.isEmpty(MDCPath)) {
            this.filePath = MDCPath;
        }
        return filePath;
    }

    public void setFilePath(String filePath) {
        String MDCPath = MDC.get("log_file_path");
        if (!StringUtils.isEmpty(filePath)) {
            this.filePath = filePath;
        }

    }
}
