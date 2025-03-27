package com.bmt.webapp.repositories;

import com.bmt.webapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositories extends JpaRepository<Client, Integer> {
    public Client findByEmail(String email);
}
