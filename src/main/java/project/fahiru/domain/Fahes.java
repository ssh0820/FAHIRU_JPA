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

@Entity
@RequiredArgsConstructor
@Getter
public class Fahes {

    @Id @GeneratedValue
    @Column(name = "fah_no")
    private int no;

    private String name;

    private String explanation;

    @Embedded
    private RegistInformation registInformation;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private FahesImg fahesImg;

}
