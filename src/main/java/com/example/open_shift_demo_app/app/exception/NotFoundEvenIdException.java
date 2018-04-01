package com.example.open_shift_demo_app.app.exception;

import com.example.open_shift_demo_app.model.domain.valueObject.event.EventId;
import lombok.Getter;

import java.util.Optional;

public class NotFoundEvenIdException extends RuntimeException {

    @Getter
    private String message;
    @Getter
    private String eventId;

    public NotFoundEvenIdException(Optional<EventId> eventId){
        this.eventId = eventId.get().getEventId();
        this.message = "イベントID "+ this.eventId + " は見つかりません。";
    }


}
