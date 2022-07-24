package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.Fahes;

@Repository
public interface FahesRepository extends JpaRepository<Fahes, Long> {

}
