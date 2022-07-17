package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@RequiredArgsConstructor
@Getter
public class CategoryFah {

    @Id @GeneratedValue
    private int no;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Fahes fahes;

    private int postNo;

    @Embedded
    private RegistInformation registInformation;
}
