package com.project.SafarBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.SafarBackend.model.Booking;



@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
	public List<Booking> findByTourid(int id);
}
