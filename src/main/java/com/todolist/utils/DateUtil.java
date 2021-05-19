package com.todolist.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static Date addDay(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }

}
