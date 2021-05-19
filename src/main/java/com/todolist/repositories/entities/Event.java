package com.todolist.repositories.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event")
public class Event {


    @Id
    @GeneratedValue
    private int id;

    @Column(name = "content")
    private String content;

    @Column(name = "event_date_time")
    private Date eventDateTime;

    @Column(name = "event_done")
    private boolean eventDone;

    public int getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setEventDateTime(Date eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public void setEventDone(boolean eventDone) {
        this.eventDone = eventDone;
    }

}
