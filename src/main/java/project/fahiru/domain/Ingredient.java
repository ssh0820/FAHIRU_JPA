package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class Ingredient {

    @Id @GeneratedValue
    private int no;

    private int cookNo;

    private String name;

    private String unit;

    @OneToMany
    private List<Ingredient> ingredients;
}
