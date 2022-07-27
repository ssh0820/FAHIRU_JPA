package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
