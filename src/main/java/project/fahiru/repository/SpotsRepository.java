package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.Spots;

@Repository
public interface SpotsRepository extends JpaRepository<Spots, Long> {
}
