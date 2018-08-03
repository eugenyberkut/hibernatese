package main;

import tables.Person;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        EntityManager em = Persistence.createEntityManagerFactory("jpa-example").createEntityManager();
        Person person = em.find(Person.class, 1);
        System.out.println(person);
    }
}
