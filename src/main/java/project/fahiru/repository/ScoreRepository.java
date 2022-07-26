package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.fahiru.domain.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
