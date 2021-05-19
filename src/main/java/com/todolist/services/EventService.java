package com.todolist.services;

import com.todolist.repositories.EventRepository;
import com.todolist.repositories.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    private static final int MIN = 0;

    public List<Event> getCurrentDay(int year, int month, int day){
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month, day, MIN, MIN);

        return eventRepository.getEventsByEventDateTime(calendar.getTime());
    }

    public void createEvent(Event event){
        eventRepository.saveEvent(event);
    }

    public void deleteEvent(Event event){
        eventRepository.deleteEvent(event);
    }

}
