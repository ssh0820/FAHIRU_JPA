package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
public class Step {

    @Id @GeneratedValue
    private int no;

    private int cookNo;

    private int cookOrder;

    private String cookStepImg;

    private String cookStepTxt;
}
