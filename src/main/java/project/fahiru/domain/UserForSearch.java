package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@RequiredArgsConstructor
@Getter
public class UserForSearch {

    public static final String LOGIN_USER = "loginUser";

    @Id @GeneratedValue
    private int no;

    private int totalCnt;

    private int followCnt;

    private String email;

    private String nickname;

    private String password;

    private String gender;

    private String message;

    private String profileImg;

    private Timestamp regdate;

    private Date birthDate;
}
