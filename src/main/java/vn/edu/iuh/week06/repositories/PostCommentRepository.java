package vn.edu.iuh.week06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.week06.models.PostComment;

import java.util.List;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
    List<PostComment> findPostCommentsByPostId(long id);
}
