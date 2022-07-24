package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@RequiredArgsConstructor
@Getter
public class SttusList {
    //구독, 좋아요, 버킷리스트, 허니팁

    @Id @GeneratedValue
    @Column(name = "sttus_no")
    private Long no;

    private Long postNo;

    private Long replyNo;

    //각 컨텐츠의 타입
    private SttusTy sttusTy;

    //각 컨텐츠의 번호
    private int sttusNo;

    @Embedded
    private RegistInformation registInformation;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Category category;
    }
