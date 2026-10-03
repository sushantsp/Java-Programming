package proxies;

import model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PushCommentRepositoryProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
//        System.out.println();
        System.out.println("Sending push notification for comment: " + comment.getText());
    }

}
