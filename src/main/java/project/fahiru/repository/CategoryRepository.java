package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.fahiru.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
