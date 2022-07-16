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
public class Follow {

    @Id @GeneratedValue
    private int no;

    private int followingUserNo;

    private int followerUserNo;

    private int cnt;

    private int tcCnt;

    private Timestamp regdate;

    private String nickname;

    private String userProfileImg;

    private boolean isFollow;

    @OneToMany
    private List<TfCook> tfCooks;
}
