package com.myproject.Workr.service;


import com.myproject.Workr.exception.ChatException;
import com.myproject.Workr.exception.ProjectException;
import com.myproject.Workr.exception.UserException;
import com.myproject.Workr.model.Chat;
import com.myproject.Workr.model.Project;
import com.myproject.Workr.model.User;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project, Long userId) throws UserException;

//	List<Project> getProjectsByOwner(User owner) throws ProjectException;

    List<Project> getProjectsByTeam(User user, String category, String tag) throws ProjectException;


    Project getProjectById(Long projectId) throws ProjectException;

    String deleteProject(Long projectId,Long userId) throws UserException;

    Project updateProject(Project updatedProject, Long id) throws ProjectException;

    List<Project> searchProjects(String keyword, User user) throws ProjectException;

    void addUserToProject(Long projectId, Long userId) throws UserException, ProjectException;

    void removeUserFromProject(Long projectId, Long userId) throws UserException, ProjectException;

    Chat getChatByProjectId(Long projectId) throws ProjectException, ChatException;



}
