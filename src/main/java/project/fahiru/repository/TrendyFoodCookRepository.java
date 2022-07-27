package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.TrendyFoodCook;

@Repository
public interface TrendyFoodCookRepository extends JpaRepository<TrendyFoodCook, Long> {
}
