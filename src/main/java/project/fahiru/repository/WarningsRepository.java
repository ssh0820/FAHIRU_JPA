package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.fahiru.domain.Warnings;

public interface WarningsRepository extends JpaRepository<Warnings, Long> {
}
