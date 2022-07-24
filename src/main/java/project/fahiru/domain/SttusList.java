package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
public class SttusList {
    //구독, 좋아요, 버킷리스트, 허니팁

    @Id @GeneratedValue
    private int no;

    private int postId;

    private int replyNo;

    //각 컨텐츠의 타입
    private SttusTy sttusTy;

    //각 컨텐츠의 번호
    private int sttusNo;

    @Embedded
    private RegistInformation registInformation;
    }
