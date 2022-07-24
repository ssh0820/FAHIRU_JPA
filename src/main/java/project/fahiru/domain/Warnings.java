package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@RequiredArgsConstructor
@Getter
public class Warnings {

    @Id @GeneratedValue
    private int no;

    private int postId;

    private String comment;

    private String reason;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Users users;

    @Embedded
    private RegistInformation registInformation;
}
