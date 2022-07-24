package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class SourceIngredients {

    @Id @GeneratedValue
    private int no;

    private String name;

    private Unit unit;

    @Embedded
    private RegistInformation registInformation;

    @OneToMany(mappedBy = "sourceIngredients")
    @JoinColumn(name = "cook_no")
    private List<CookDetail> cookDetailList = new ArrayList<>();
}
