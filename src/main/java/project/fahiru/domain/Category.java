package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_no")
    private int no;

    @Column(name = "name")
    private CategoryName categoryName;

    @Embedded
    private RegistInformation registInformation;

    @OneToMany(mappedBy = "category")
    private List<CookDetail> cookDetailList = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<CategoryFah> CategoryFah = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Warnings> warningsList = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<SttusList> sttusList = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Score> scoreList = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Spots> spotsList = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Comment> commentList = new ArrayList<>();

}
