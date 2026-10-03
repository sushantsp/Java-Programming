package proxies;

import model.Comment;
import repositories.CommentRepository;

public class EmailCommentRepositoryProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
