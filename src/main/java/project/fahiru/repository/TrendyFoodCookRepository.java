package project.fahiru.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.QTrendyFoodCook;
import project.fahiru.domain.TrendyFoodCook;
import project.fahiru.dto.TrendySearch;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class TrendyFoodCookRepository {

    private final EntityManager em;

    private JPAQueryFactory factory;

    public void save(TrendyFoodCook foodCook){
        em.persist(foodCook);
    }

    public TrendyFoodCook findOne(Long cookNo){
        return em.find(TrendyFoodCook.class,cookNo);
    }

    public List<TrendyFoodCook> findAll (TrendySearch trendySearch){

        factory = new JPAQueryFactory(em);
        QTrendyFoodCook foodCook = QTrendyFoodCook.trendyFoodCook;

        List<TrendyFoodCook> trendyList = factory.selectFrom(foodCook)
                .where(
                    foodCook.name.eq(trendySearch.getName())
                        , foodCook.score.eq(trendySearch.getScore())
                )
                .orderBy(foodCook.no.desc()).fetch();

        return trendyList;
    }




}
