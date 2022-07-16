package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@RequiredArgsConstructor
public class Cook {

    @Id @GeneratedValue
    private int no;

    private int cookAmount;

    private int categoryNo;

    private int cnt;

    private int userNo;

    private String cookTime;

    private String openAccept;

    private String tipAccept;

    private String profileImg;

    private String img;

    private String nickname;

    private String name;

    private String imgFilter;

    private Timestamp regdate;

    private double taste;

    private double plating;

    private double score;
}
