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
public class PostFah {

    @Id @GeneratedValue
    private int no;

    private int categoryNo;

    private int fahNo;

    private int postNo;

    private Timestamp regdate;

    private double score;
}
