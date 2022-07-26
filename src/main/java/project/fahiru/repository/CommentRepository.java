package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.fahiru.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
