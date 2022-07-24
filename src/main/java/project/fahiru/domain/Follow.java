package project.fahiru.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Users users;
}
