package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

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
    private Category category;

    @OneToMany(mappedBy = "cookDetail")
    private List<MainIngredients> mainIngredientsList = new ArrayList<>();

    @OneToMany(mappedBy = "cookDetail")
    private List<SourceIngredients> sourceIngredientsList = new ArrayList<>();

    @OneToMany(mappedBy = "cookDetail")
    private List<Step> stepList = new ArrayList<>();

}
