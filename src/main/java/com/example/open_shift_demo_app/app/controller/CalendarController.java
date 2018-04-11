package com.example.open_shift_demo_app.app.controller;

import com.example.open_shift_demo_app.app.exception.NotFoundEvenIdException;
import com.example.open_shift_demo_app.model.entity.EventEntity;
import com.example.open_shift_demo_app.model.repository.EventRepository;
import com.example.open_shift_demo_app.model.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("calendar")
public class CalendarController {

    @Autowired
    EventRepository repository;

    @Autowired
    EventService eventService;

    @GetMapping("events")
    public Iterable<EventEntity> getEvents() {
        return eventService.search();
    }

    @GetMapping("event/{eventId}")
    public Optional<EventEntity> getEvent(@PathVariable String eventId) {
        Optional<EventEntity> eventEntity = eventService.search(eventId);
        return eventEntity;
    }

    @PostMapping("event")
    public Optional<EventEntity> postEvent(@RequestBody EventEntity eventEntity) {
        EventEntity tempEntity = new EventEntity(null,
                eventEntity.getTitle(),
                eventEntity.getDescription(),
                eventEntity.getStartDate(),
                eventEntity.getEndDate());
        return eventService.regist(tempEntity);
    }

    @DeleteMapping("/vent/{eventId}")
    public Optional<String> deleteEvent(@PathVariable String eventId) {
        Optional<String> deleteResult = eventService.delete(eventId);
        return deleteResult;
    }

    @ExceptionHandler(NotFoundEvenIdException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Map<String, Object> handleError(NotFoundEvenIdException e) {
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("message", e.getMessage());
        errorMap.put("status", HttpStatus.NOT_FOUND);
        return errorMap;
    }
}
