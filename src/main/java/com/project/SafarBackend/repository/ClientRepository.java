package com.project.SafarBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.SafarBackend.model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
	public Client findByEmail(String email);

}
