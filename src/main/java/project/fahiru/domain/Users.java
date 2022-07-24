package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "folloingUsers")
    private List<Follow> folloingList = new ArrayList<>();

    @OneToMany(mappedBy = "followerUsers")
    private List<Follow> followerList = new ArrayList<>();

}
