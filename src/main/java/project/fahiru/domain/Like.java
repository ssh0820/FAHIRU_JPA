package project.fahiru.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Like {
    @Id @GeneratedValue
    private int no;

    private int categoryNo;

    private int postNo;

    private int userNo;

    private int replyNo;

    private int stepNo;

    private int honeytipNo;

    private int replyLikeCnt;

    private int tfCnt;

    private int cookBucketCnt;

    private int spotBucketCnt;

    private int score;

    private int cnt;

    private int tfLikeCnt;

    private int bucketTFCnt;

    private int likeCnt;

    private int cookTipLikeCnt;

    private Timestamp regdate;

    private String nickname;

    private String name;

    private String img;

    private String profileImg;

    private double taste;

    private double plating;
}
