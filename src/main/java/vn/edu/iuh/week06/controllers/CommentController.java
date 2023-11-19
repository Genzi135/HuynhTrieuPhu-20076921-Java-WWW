package vn.edu.iuh.week06.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.edu.iuh.week06.models.Post;
import vn.edu.iuh.week06.models.PostComment;
import vn.edu.iuh.week06.models.User;
import vn.edu.iuh.week06.services.PostCommentService;

import java.time.Instant;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private PostCommentService postCommentService;

    @PostMapping("/")
    public String addComment(@ModelAttribute("comment") PostComment comment,
                             HttpSession session,
                             HttpServletRequest request) {
        comment.setCreatedAt(Instant.now());
        comment.setPublishedAt(Instant.now());
        postCommentService.save(comment);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
}
