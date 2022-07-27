package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
