package com.myproject.Workr.repository;

import com.myproject.Workr.model.Chat;
import com.myproject.Workr.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {


    Chat findByProject(Project projectById);

//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}
