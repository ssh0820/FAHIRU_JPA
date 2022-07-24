package project.fahiru.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
public class Follow {

    @Id @GeneratedValue
    private int no;

    private int folloingUserNo;

    private int followerUserNo;

    @Embedded
    private RegistInformation registInformation;
}
