package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

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
public class FahesImg {
    @Id
    @GeneratedValue
    @Column(name = "img_no")
    private int no;

    private String img;

    private String imgFilter;

    @Embedded
    private RegistInformation registInformation;

    @OneToMany(mappedBy = "fahesImg")
    @JoinColumn(name = "fah_no")
    private List<Fahes> fahesList = new ArrayList<>();
}
