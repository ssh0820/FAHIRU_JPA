package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class Step {

    @Id @GeneratedValue
    private int no;

    private String cookStepImg;

    private String cookStepTxt;

    @OneToMany(mappedBy = "step")
    private List<CookDetail> cookDetailList = new ArrayList<>();

    private RegistInformation registInformation;
}
