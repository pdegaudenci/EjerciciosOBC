package com.example.Ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

        CocheRepository coches = context.getBean(CocheRepository.class);

        System.out.println("El numero de coches en BD es:" + coches.count());

        Coche cocheToyota = new Coche(null, "Toyota", "prius", 2015);
        coches.save(cocheToyota);
        System.out.println("El numero de coches en BD es:" + coches.count());

        System.out.println(coches.findAll());
    }


}
