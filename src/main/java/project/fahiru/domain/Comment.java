package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
public class Comment {

    @Id @Getter
    private int no;

    private int postId;

    private String content;

    private String commentImg;

    @Embedded
    private RegistInformation registInformation;
}
