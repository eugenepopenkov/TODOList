package com.todolist.services;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class DateTimeService {

    public Calendar getCurrentMonth(int year, int month){
        return new GregorianCalendar(year, month, 1);
    }

}
