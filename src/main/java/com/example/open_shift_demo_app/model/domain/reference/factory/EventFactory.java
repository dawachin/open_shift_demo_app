package com.example.open_shift_demo_app.model.domain.reference.factory;

import com.example.open_shift_demo_app.model.domain.domainObject.valueObject.event.*;
import com.example.open_shift_demo_app.model.domain.reference.Event;
import com.example.open_shift_demo_app.model.entity.EventEntity;

import java.util.Optional;

public class EventFactory {

    public static Optional<Event> asEvent(Optional<EventEntity> eventEntity) {
        EventEntity entity = eventEntity.get();
        return Optional.of(new Event(
                Optional.of(new EventId(entity.getId())),
                Optional.of(new Title(entity.getTitle())),
                Optional.of(new Description(entity.getDescription())),
                Optional.of(new StartDate(entity.getStartDate())),
                Optional.of(new EndDate(entity.getEndDate()))));

    }



}
