package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class MainIngredients {

    @Id @GeneratedValue
    private int no;

    @OneToMany(mappedBy = "mainIngredients")
    @JoinColumn(name = "tr")
    private List<CooksDetail> detailList = new ArrayList<>();
}
