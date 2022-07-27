package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.TendScore;

@Repository
public interface TendScoreRepository extends JpaRepository<TendScore, Long> {
}
