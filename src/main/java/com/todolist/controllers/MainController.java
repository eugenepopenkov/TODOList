package com.todolist.controllers;


import com.todolist.repositories.entities.Event;
import com.todolist.services.DateTimeService;
import com.todolist.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private DateTimeService dateTimeService;

    @Autowired
    private EventService eventService;

    @GetMapping("/todo/api/home")
    public String getHome(){
        return "Homepage";
    }

    @GetMapping("/todo/api")
    public Calendar getCurrentMonth(@RequestParam(value = "y") int year,
                                    @RequestParam(value = "m") int month){
        return dateTimeService.getCurrentMonth(year, month);
    }

    @GetMapping("/todo/api")
    public List<Event> getCurrentDay(@RequestParam(value = "y") int year,
                                     @RequestParam(value = "m") int month,
                                     @RequestParam(value = "d") int day){
        return eventService.getCurrentDay(year, month, day);
    }

    @PostMapping("/createEvent")
    public void createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
    }

    @PutMapping("/deleteEvent")
    public void deleteEvent(@RequestBody Event event){
        eventService.deleteEvent(event);
    }
}
