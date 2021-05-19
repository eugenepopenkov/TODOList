package com.todolist.repositories;

import com.todolist.repositories.entities.Event;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EventRepository {

    List<Event> getEventsByEventDateTime(Date eventDate);

    void saveEvent(Event event);

    void deleteEvent(Event event);

}
