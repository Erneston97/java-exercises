package com.mitocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediappBackedApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediappBackedApplication.class, args);
        System.out.println("Hola mundo");
    }


}
