package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@RequiredArgsConstructor
@Getter
public class Users {

    @Id @GeneratedValue
    @Column(name = "user_no")
    private int no;

    private String email;

    private String nickname;

    private String password;

    private String gender;

    private Date birthDate;

    private String message;

    private String profileImg;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Follow follow;

}
