package com.myproject.Workr.service;

import com.myproject.Workr.exception.IssueException;
import com.myproject.Workr.exception.UserException;
import com.myproject.Workr.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long issueId, Long userId, String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}