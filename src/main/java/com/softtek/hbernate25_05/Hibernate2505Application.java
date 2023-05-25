package com.softtek.hbernate25_05;

import com.softtek.hbernate25_05.modelo.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hibernate2505Application {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate2505Application.class, args);
    }
}
