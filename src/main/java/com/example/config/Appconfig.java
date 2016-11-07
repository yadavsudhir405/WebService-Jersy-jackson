package com.example.config;

import com.example.entity.Reservation;
import com.example.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.stream.Stream;

/**
 * @author sudhir
 *         Date:7/11/16
 *         Time:4:13 PM
 *         Project:demo
 */
@Configuration
public class Appconfig {
    @Bean
    public CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
        return strings -> {
            Stream.of("Bangalore","Chennai","Delhi").forEach(city->reservationRepository.save(new Reservation(city)));
        };
    }

}
