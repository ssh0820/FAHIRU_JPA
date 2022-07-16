package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@RequiredArgsConstructor
@Getter
public class CookTip {

    @Id @GeneratedValue
    private int no;

    private int cookNo;

    private int stepNo;

    private int userNo;

    private Timestamp regdate;

    private String content;

    private String profileImg;

    private String nickname;
}
