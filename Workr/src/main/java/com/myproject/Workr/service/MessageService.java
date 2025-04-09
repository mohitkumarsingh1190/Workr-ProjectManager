package com.myproject.Workr.service;

import com.myproject.Workr.exception.ChatException;
import com.myproject.Workr.exception.ProjectException;
import com.myproject.Workr.exception.UserException;
import com.myproject.Workr.model.Message;

import java.util.List;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}
