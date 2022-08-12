package project.fahiru.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPADeleteClause;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.fahiru.domain.Fahes;
import project.fahiru.domain.QFahes;
import project.fahiru.dto.FahesSearch;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class FahesRepository{

    private final EntityManager em;
    private JPAQueryFactory factory;

    public void save(Fahes fahes){
        em.persist(fahes);
    }

    public Fahes findOne(Long fahNo){
        return em.find(Fahes.class,fahNo);
    }

    public List<Fahes> findAll (FahesSearch fahesSearch){

        factory = new JPAQueryFactory(em);
        QFahes fahes = QFahes.fahes;
        List<Fahes> fahList = factory.selectFrom(fahes)
                .where(
                        fahes.name.eq(fahesSearch.getName())
                      , fahes.explanation.eq(fahesSearch.getExplanation())
                )
                .orderBy(fahes.no.desc()).fetch();

        return fahList;

    }

    public Long deleteById(Long fahNo){

        factory = new JPAQueryFactory(em);
        QFahes fahes = QFahes.fahes;
        BooleanBuilder builder = new BooleanBuilder();

        if(fahNo != null){
            builder.and(fahes.no.eq(fahNo));
        }

        JPADeleteClause result = factory.delete(fahes).where(builder);

        return result.execute();
    }

}
