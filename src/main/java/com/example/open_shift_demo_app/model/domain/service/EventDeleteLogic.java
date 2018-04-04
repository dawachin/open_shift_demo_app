package com.example.open_shift_demo_app.model.domain.service;

import com.example.open_shift_demo_app.app.exception.NotFoundEvenIdException;
import com.example.open_shift_demo_app.model.domain.object.value.event.EventId;
import com.example.open_shift_demo_app.model.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EventDeleteLogic {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    EventSearchLogic eventSearchLogic;

    /** 削除実行 */
    public Optional<EventId> doDelete(Optional<EventId> eventId) {

        if (!eventSearchLogic.isExest(eventId.get())) {
            throw new NotFoundEvenIdException(eventId);
        }

        eventRepository.deleteById(eventId.get().getEventId());

        return eventId;
    }
}
