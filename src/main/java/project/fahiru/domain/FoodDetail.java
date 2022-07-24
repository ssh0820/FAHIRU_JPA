package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@RequiredArgsConstructor
@Getter
public class FoodDetail {

    @Id @GeneratedValue
    private int no;

    private int price;

    private Taste taste;

    private Plating plating;

    @Embedded
    private RegistInformation registInformation;
}
