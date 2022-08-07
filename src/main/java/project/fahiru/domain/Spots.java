package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class Spots {

    @Id @GeneratedValue
    @Column(name = "spot_no")
    private Long no;

    private String name;

    private String address;

    private String addressDetail;

    private String timeInfomation;

    private String parking;

    private String groupName;

    private double taste;

    private double plating;

    private double latitude;

    private double lohgitude;

    @Embedded
    private RegistInformation registInformation;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Category category;

    @OneToMany(mappedBy = "spots")
    private List<FoodDetail> foodDetailList = new ArrayList<>();

}
