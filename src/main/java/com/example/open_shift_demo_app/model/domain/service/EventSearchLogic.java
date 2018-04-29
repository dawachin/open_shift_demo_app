package com.example.open_shift_demo_app.model.domain.service;

import com.example.open_shift_demo_app.app.exception.NotFoundEvenIdException;
import com.example.open_shift_demo_app.model.domain.object.reference.Event;
import com.example.open_shift_demo_app.model.domain.object.reference.factory.EventFactory;
import com.example.open_shift_demo_app.model.domain.object.value.event.EventId;
import com.example.open_shift_demo_app.model.entity.EventEntity;
import com.example.open_shift_demo_app.model.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EventSearchLogic {

    @Autowired
    EventRepository eventRepository;

    public Optional<Event> doSearch(EventId eventId) {

        // 検索
        Optional<EventEntity> resultEntity = eventRepository.findEventEntityById(eventId.getEventId());

        if (isExest(eventId)) {
            throw new NotFoundEvenIdException(Optional.of(eventId));
        }

        return EventFactory.asEvent(resultEntity);
    }

    public Iterable<EventEntity> doSearch() {
        // 検索
        Iterable<EventEntity> resutEntitys = eventRepository.findAll();
        return resutEntitys;
    }

    public boolean isExest(EventId eventId) {
        Optional<EventEntity> exestEvent = eventRepository.findEventEntityById(eventId.getEventId());
        return !exestEvent.equals(Optional.empty());
    }
}
