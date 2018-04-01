package com.example.open_shift_demo_app.model.domain.reference;

import com.example.open_shift_demo_app.model.domain.domainService.EventSearchLogic;
import com.example.open_shift_demo_app.model.domain.valueObject.event.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 *
 * スケジュール
 *
 */
@Data
@Component
public class Event {

    private Optional<EventId> eventId;


    private Optional<Title> title;


    private Optional<Description> description;


    private Optional<StartDate> startDate;


    private Optional<EndDate> endDate;


    public Event(Optional<EventId> eventId,
                 Optional<Title> title,
                 Optional<Description> description,
                 Optional<StartDate> startDate,
                 Optional<EndDate> endDate) {

        this.eventId = eventId;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;

    }
}
