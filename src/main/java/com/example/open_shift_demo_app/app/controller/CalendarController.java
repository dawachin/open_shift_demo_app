package com.example.open_shift_demo_app.app.controller;

import com.example.open_shift_demo_app.app.exception.NotFoundEvenIdException;
import com.example.open_shift_demo_app.model.entity.EventEntity;
import com.example.open_shift_demo_app.model.repository.EventRepository;
import com.example.open_shift_demo_app.model.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);


    @Autowired
    EventRepository repository;

    @Autowired
    EventService eventService;

    @GetMapping("/events")
    public Iterable<EventEntity> getEvents() {
        logger.info("予定：全件検索が行われました。");
        return eventService.search();
    }

    @GetMapping("/event/{eventId}")
    public Optional<EventEntity> getEvent(@PathVariable String eventId) {
        Optional<EventEntity> rtnEntity = eventService.search(eventId);
        logger.info("予定：ID検索が行われました。ID = {}", eventId);
        return rtnEntity;
    }

    @PostMapping("/event")
    public Optional<EventEntity> postEvent(@RequestBody EventEntity eventEntity) {
        EventEntity tempEntity = new EventEntity(null,
                eventEntity.getTitle(),
                eventEntity.getDescription(),
                eventEntity.getStartDate(),
                eventEntity.getEndDate());
        return eventService.regist(tempEntity);
    }

    @DeleteMapping("/event/{eventId}")
    public Optional<String> deleteEvent(@PathVariable String eventId) {
        Optional<String> rtnEntity = eventService.delete(eventId);
        return rtnEntity;
    }

    @ExceptionHandler(NotFoundEvenIdException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Map<String, Object> handleError(NotFoundEvenIdException e) {
        Map<String, Object> errorMap = new HashMap<String, Object>();
        errorMap.put("message", e.getMessage());
        errorMap.put("status", HttpStatus.NOT_FOUND);
        return errorMap;
    }
}
