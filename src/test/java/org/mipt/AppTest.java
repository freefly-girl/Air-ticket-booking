package org.mipt;

import org.junit.jupiter.api.*;
import org.assertj.core.api.Assertions;
import org.mipt.domain.Aircrafts;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AppTest {
    private EntityManager em;

    @Test
    void helloTest() {
        Assertions.assertThat(2 + 2).isEqualTo(4);
    }

    @BeforeEach
    public void init() {
        var emf = Persistence.createEntityManagerFactory("Homework3");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    @AfterEach
    public void close() {
        em.getTransaction().commit();
        em.getEntityManagerFactory().close();
        em.close();
    }

    @Test
    public void shouldPersistAircrafts() {
        var aircraft = new Aircrafts();
        aircraft.setAircraftCode("1");
        aircraft.setModel("Airbus320");
        aircraft.setRange(10000);
        em.persist(aircraft);
        em.flush();
    }

    @Test
    public void shouldFindCategory() {
        var aircraft = new Aircrafts();
        aircraft.setAircraftCode("1");
        aircraft.setModel("Airbus320");
        aircraft.setRange(10000);
        em.persist(aircraft);
        var result = em.find(Aircrafts.class, "1");
        Assertions.assertThat(result).isEqualTo(aircraft);
    }
}
