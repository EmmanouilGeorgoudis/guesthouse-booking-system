package com.example.guesthousebookingsystem;

import com.example.guesthousebookingsystem.models.Room;
import com.example.guesthousebookingsystem.repositories.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GuesthouseBookingSystemApplication {

    public static void main(String[] args) {SpringApplication.run(GuesthouseBookingSystemApplication.class, args);}

    @Bean
    public CommandLineRunner demo(RoomRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new Room("A1"));
                repo.save(new Room("A2"));
                repo.save(new Room("A3"));
                repo.save(new Room("A4"));
                repo.save(new Room("A5"));
                repo.save(new Room("B1"));
                repo.save(new Room("B2"));
                repo.save(new Room("B3"));
                repo.save(new Room("B4"));
                repo.save(new Room("B5"));
            }
        };
    }
}
