package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by denys on 5/23/2017.
 */
public class Main {
    private static  final Logger LOGGER = LoggerFactory.getLogger(DAO.class);
    static{
        try {
            LOGGER.info("Loading jdbc driver: org.postgresql.Driver.");
            Class.forName("com.mysql.jdbc.Driver");   //Class.forName("org.postgresql.Driver");
            LOGGER.info("Driver loaded successfully.");
        } catch (ClassNotFoundException e) {
            LOGGER.error("Cannot find driver: org.postgresql.Driver");
            throw new RuntimeException(e);
//        e.printStackTrace();
        }
    }

    public static void main(String[] args) {


    /*
    1. DRIVER.JAR in classpath
    2. Register Driver in program
    3. USE java.sql.*
     */







//        DAO dao = new DatabaseDAO();
//        int id = 2;
//        Person person = new Person();
//        person.setAge(30);
//        person.setName("Denis");
//        System.out.println("----CREATE-----");
//        dao.create(person);
//
//
//        Person readPerson = dao.read(id);
//        System.out.println("----READ-----");
//        System.out.println(readPerson);
//
//        Person personUpdated = new Person();
//        personUpdated.setName("Boris");
//        personUpdated.setAge(45);
//        Person oldPerson = dao.update(id, personUpdated);
//        System.out.println("----UPDATE-----");
//        System.out.println("----old person:-----");
//        System.out.println(oldPerson);
//        System.out.println("----current person:-----");
//        Person currentPerson = dao.read(id);
//        System.out.println(currentPerson);
//
//        System.out.println("----DELETE-----");
//        dao.delete(id);
//        // System.out.println("----current person:-----");
//        // Person currentPersonAfterDelete=dao.read(1);
//        // System.out.println(currentPersonAfterDelete);
    }
}
