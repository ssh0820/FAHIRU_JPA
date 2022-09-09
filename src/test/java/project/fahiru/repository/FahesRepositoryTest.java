package project.fahiru.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import project.fahiru.domain.Fahes;
import project.fahiru.dto.FahesSearch;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class FahesRepositoryTest {

    EntityManager em;

    FahesRepository fahesRepository;

    @Test
    @Transactional
    public void save(){

        Fahes fahes = new Fahes("현이","등록");

        fahesRepository.save(fahes);

        em.flush();
        em.clear();

        FahesSearch fahesSearch = new FahesSearch("현이","등록");

        List<Fahes> fahesList = fahesRepository.findAll(fahesSearch);

        if (fahesList.isEmpty()){

        }else{

        }


    }

}