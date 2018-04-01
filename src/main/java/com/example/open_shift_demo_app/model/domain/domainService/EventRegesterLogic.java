package com.example.open_shift_demo_app.model.domain.domainService;

import com.example.open_shift_demo_app.model.domain.reference.Event;
import com.example.open_shift_demo_app.model.entity.EventEntity;
import com.example.open_shift_demo_app.model.entity.factory.EventEntityFactory;
import com.example.open_shift_demo_app.model.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EventRegesterLogic {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    EventSearchLogic eventSearchLogic;

    /** 登録実行 */
    public Optional<Event> doRegist(Optional<Event> event) {

        boolean test = eventSearchLogic.isExest(event.get().getEventId().get());

        EventEntity saveEvent = EventEntityFactory.asEventEntity(event);

        eventRepository.save(saveEvent);

        return event;
    }
}





