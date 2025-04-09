package com.myproject.Workr.repository;

import com.myproject.Workr.model.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InviteTokenRepository extends JpaRepository<Invitation, Long> {

    void deleteByToken(String token);

    Invitation findByToken(String token);

    Invitation findByEmail(String userEmail);
}