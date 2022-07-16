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
public class Reply {

    @Id @GeneratedValue
    private int no;

    private int categoryNo;

    private int userNo;

    private int postNo;

    private int cnt;

    private int likeCnt;

    private String content;

    private String replyImg;

    private String nickname;

    private String profileImg;

    private Timestamp regdate;

    @OneToMany
    private List<Reply> reply;

    private boolean likeFlag;
}
