package com.todolist.repositories;

import com.todolist.repositories.entities.Event;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


import static com.todolist.utils.DateUtil.addDay;


public class EventRepositoryImpl implements EventRepository{

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.todolist.repositories.entities");

    private EntityManager entityManager = entityManagerFactory.createEntityManager();


    public List<Event> getEventsByEventDateTime(Date eventDate) {
        TypedQuery<Event> query = entityManager.createQuery(
                "SELECT e.content, e.eventDateTime as edt, e.eventDone "
                        + "FROM Event e "
                        + "WHERE e.eventDateTime >= :eventDate "
                        + "and e.eventDateTime < :nextDay ", Event.class);

        query.setParameter("eventDate", eventDate);
        query.setParameter("nextDay", addDay(eventDate));
        return query.getResultList();
    }

    public void saveEvent(Event event) {
        entityManager.getTransaction().begin();
        entityManager.persist(event);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }

    public void deleteEvent(Event event) {
        if (entityManager.contains(event)) {
            entityManager.remove(event);
        } else {
            entityManager.merge(event);
        }

    }
}
