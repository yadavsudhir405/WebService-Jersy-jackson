package com.example.repository;

import com.example.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author sudhir
 *         Date:7/11/16
 *         Time:4:05 PM
 *         Project:demo
 */
@Component
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    public Collection<Reservation> findByReservationName(String reservationName);
}
