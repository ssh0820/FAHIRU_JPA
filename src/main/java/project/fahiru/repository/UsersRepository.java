package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
