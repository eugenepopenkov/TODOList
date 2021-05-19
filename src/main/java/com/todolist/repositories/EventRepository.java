package com.todolist.repositories;

import com.todolist.repositories.entities.Event;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EventRepository {

    List<Event> getEventsByEventDateTime(Date eventDate);

    void saveEvent(Event event);

    void deleteEvent(Event event);

}
