package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
public class TfCook {

    @Id @GeneratedValue
    private int no;

    private int userNo;

    private int categoryNo;

    private int cnt;

    private int fahNo;

    private int spotNo;

    private int bucketCnt;

    private double score;

    private String nickname;

    private String profileImg;

    private String name;

    private String img;

    private String imgFilter;
}
