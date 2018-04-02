package com.example.open_shift_demo_app.model.repository;

import com.example.open_shift_demo_app.model.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EventRepository extends JpaRepository<EventEntity, String> {

    Optional<EventEntity> findEventEntityById(String eventId);

}
