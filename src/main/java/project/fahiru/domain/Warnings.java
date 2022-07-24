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

@Entity
@RequiredArgsConstructor
@Getter
public class Warnings {

    @Id @GeneratedValue
    @Column(name = "warning_no")
    private Long no;

    private Long postNo;

    private String comment;

    private String reason;

    @Embedded
    private RegistInformation registInformation;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Users users;
}
