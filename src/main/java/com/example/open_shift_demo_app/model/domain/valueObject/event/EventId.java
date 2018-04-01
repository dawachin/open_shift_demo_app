package com.example.open_shift_demo_app.model.domain.valueObject.event;

import com.example.open_shift_demo_app.model.domain.valueObject.ValueObjectAbstract;
import com.example.open_shift_demo_app.model.domain.valueObject.ValueObjectInterface;
import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class EventId extends ValueObjectAbstract implements ValueObjectInterface {

    @Getter
    private String eventId;

    @Getter
    private final String NAME = "イベントId";

    /** コンストラク */
    public EventId(String eventId) {
        this();
        isCheck();
        if (!StringUtils.isEmpty(eventId)) {
            this.eventId = eventId;
        }
    }

    /** コンストラクタ
     *
     * 新規発行時
     * */
    public EventId() {
        String createEventId = RandomStringUtils.randomAlphanumeric(10);
        isCheck();
        this.eventId = createEventId;
    }


    /** 値チェック */
    protected void isCheck() {

    }
}
