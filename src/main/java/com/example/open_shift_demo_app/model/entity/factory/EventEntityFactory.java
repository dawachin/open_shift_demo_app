package com.example.open_shift_demo_app.model.entity.factory;

import com.example.open_shift_demo_app.model.domain.reference.Event;
import com.example.open_shift_demo_app.model.entity.EventEntity;

import java.util.Optional;

public class EventEntityFactory {

    /**
     * EventクラスからEventEntityクラスに詰め替えます
     * @param event
     * @return {@link EventEntity}
     */
    public static EventEntity asEventEntity(Optional<Event> event) {
        return new EventEntity(event.get().getEventId().get().getEventId(),
                event.get().getTitle().get().getTitle(),
                event.get().getDescription().get().getDescription(),
                event.get().getStartDate().get().getStartDate(),
                event.get().getEndDate().get().getEndDate());

    }


}
