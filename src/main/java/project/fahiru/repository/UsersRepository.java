package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.fahiru.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
