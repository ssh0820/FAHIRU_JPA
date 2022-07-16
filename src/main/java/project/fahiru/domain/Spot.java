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
public class Spot {

    @Id @GeneratedValue
    private int no;

    private int categoryNo;

    private int userNo;

    private int cnt;

    private int spotId;

    private int spotBucketCnt;

    private String name;

    private String img;

    private String imgFilter;

    private String address;

    private String subAddress;

    private String tfName;

    private String exist;

    private String timeInfo;

    private String parking;

    private String together;

    private String phoneNumer;

    private String nickname;

    private String profileImg;

    private double taste;

    private double plating;

    private double latitude;

    private double longitude;

    private double tftaste;

    private double tfplating;

    private Timestamp regdate;

    @OneToMany
    private List<TfCook> tfList;

    @OneToMany
    private List<Fah> fahList;
}
