package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@RequiredArgsConstructor
@DiscriminatorValue("COOK")
@Getter
public class CookDetail extends TrendyFoodCook{

    private String cookTime;

    private int cookAmount;

    private String openAccept;

    private String tipAccept;

    private Plating plating;

    private Taste taste;

    @Embedded
    private RegistInformation registInformation;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private MainIngredients mainIngredients;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private SourceIngredients sourceIngredients;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Step step;

}
