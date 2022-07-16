package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class Fah {

    @Id @GeneratedValue
    private int no;

    private int categoryNo;

    private int userNo;

    private int postNo;

    private int cnt;

    private int ranking;

    private int cntFah;

    private int spotNo;

    private String explanation;

    private String fahImg;

    private String nickname;

    private String profileImg;

    private String name;

    private Timestamp regdate;

    private double score;

    @OneToMany
    private List<TfCook> tfCooks;

}
