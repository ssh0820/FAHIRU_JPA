package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
public class FahesImg {
    @Id
    @GeneratedValue
    @Column(name = "img_no")
    private Long no;

    private String img;

    private String imgFilter;

    @Embedded
    private RegistInformation registInformation;

}
