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
public class FahiryScore {

    @Id @GeneratedValue
    private int no;

    private int fahNo;

    private double score;

    private Timestamp regdate;
}
