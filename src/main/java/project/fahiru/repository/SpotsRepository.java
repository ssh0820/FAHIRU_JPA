package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.fahiru.domain.Spots;

public interface SpotsRepository extends JpaRepository<Spots, Long> {
}
