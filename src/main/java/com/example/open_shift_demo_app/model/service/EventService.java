package com.example.open_shift_demo_app.model.service;

import com.example.open_shift_demo_app.model.domain.object.value.event.EventId;
import com.example.open_shift_demo_app.model.domain.service.EventDeleteLogic;
import com.example.open_shift_demo_app.model.domain.service.EventRegesterLogic;
import com.example.open_shift_demo_app.model.domain.service.EventSearchLogic;
import com.example.open_shift_demo_app.model.domain.object.reference.Event;
import com.example.open_shift_demo_app.model.domain.object.reference.factory.EventFactory;
import com.example.open_shift_demo_app.model.entity.EventEntity;
import com.example.open_shift_demo_app.model.entity.factory.EventEntityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService {

    @Autowired
    EventRegesterLogic eventRegesterLogic;
    
    @Autowired
    EventSearchLogic eventSearchLogic;

    @Autowired
    EventDeleteLogic eventDeleteLogic;

    /** 参照処理 */
    public Optional<EventEntity> search(String targetId) {

        // ドメイン空間に変換
        EventId eventId = new EventId(targetId);

        // 検索ロジック
        Optional<Event> resultEvent = eventSearchLogic.doSearch(eventId);

        return Optional.of(EventEntityFactory.asEventEntity(resultEvent));
    }

    public Iterable<EventEntity> search() {
        // 検索ロジック
        return eventSearchLogic.doSearch();
    }


    /** 登録処理 */
    public Optional<EventEntity> regist(EventEntity eventEntity) {

        // ドメイン空間に変換
        Optional<Event> saveEvent = EventFactory.asEvent(Optional.of(eventEntity));

        // 登録ロジック
        Optional<Event> resultEvent = eventRegesterLogic.doRegist(saveEvent);

        return Optional.of(EventEntityFactory.asEventEntity(resultEvent));


    }


    /** 削除処理 */
    public Optional<String> delete(String targetId) {

        // ドメイン空間に変換
        Optional<EventId> eventId = Optional.of(new EventId(targetId));

        // 検索ロジック
        Optional<EventId> resultEvent = eventDeleteLogic.doDelete(eventId);

        return Optional.of(resultEvent.get().getEventId());
    }
}

