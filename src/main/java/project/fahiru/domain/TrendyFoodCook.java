package project.fahiru.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
@RequiredArgsConstructor
@Getter
public class TrendyFoodCook {

    @Id @GeneratedValue
    @Column(name = "cook_no")
    private Long no;

    private Long score;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @Embedded
    private RegistInformation registInformation;

    //TrendyFoodCook 수정 생성자( name, score )
    public TrendyFoodCook(String name, Long score){
        this.name = name;
        this.score = score;
    }

}
