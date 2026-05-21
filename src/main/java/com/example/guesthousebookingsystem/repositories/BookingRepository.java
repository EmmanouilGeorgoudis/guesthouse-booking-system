package com.example.guesthousebookingsystem.repositories;

import com.example.guesthousebookingsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {


}