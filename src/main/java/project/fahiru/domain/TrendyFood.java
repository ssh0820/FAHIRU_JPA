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
public class TrendyFood {

    @Id @GeneratedValue
    private int no;

    private int spotNo;

    private int price;

    private int categoryNo;

    private int score;

    private int cnt;

    private int userNo;

    private int bucketTFCnt;

    private String shopName;

    private String name;

    private String nickname;

    private String profileImg;

    private String img;

    private String imgFilter;

    private double taste;

    private double plating;

    private Timestamp regdate;
}
