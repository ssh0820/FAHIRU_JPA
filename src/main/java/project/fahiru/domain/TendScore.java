package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

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
public class TendScore {

    @Id @GeneratedValue
    private int no;

    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    private Fahes fahes;

    @Embedded
    private RegistInformation registInformation;
}
