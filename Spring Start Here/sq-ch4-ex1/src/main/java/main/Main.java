package main;

import model.Comment;
import proxies.EmailCommentRepositoryProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentRepositoryProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();

        comment.setAuthor("Sushant");
        comment.setText("Demo comment");

        // calls the publish comment use case
        commentService.publishComment(comment);
    }
}
