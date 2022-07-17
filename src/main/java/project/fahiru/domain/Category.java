package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_no")
    private int no;

    private CategoryName categoryName;

    @Embedded
    private RegistInformation registInformation;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    @JoinColumn(name = "category_no")
    private List<Fahes> fahesList = new ArrayList<>();

}
