package project.fahiru.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FahesRepository {

    @PersistenceContext
    private EntityManager em;

}
