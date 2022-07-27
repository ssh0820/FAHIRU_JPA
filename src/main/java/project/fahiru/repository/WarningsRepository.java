package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.Warnings;

@Repository
public interface WarningsRepository extends JpaRepository<Warnings, Long> {
}
