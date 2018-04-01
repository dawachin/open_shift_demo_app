package com.example.open_shift_demo_app.model.repository;

import com.example.open_shift_demo_app.model.entity.EventEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface EventRepository extends MongoRepository<EventEntity, String> {

    @Override
    Iterable<EventEntity> findAllById(Iterable<String> iterable);

    Optional<EventEntity> findEventEntityById(String eventId);

}
