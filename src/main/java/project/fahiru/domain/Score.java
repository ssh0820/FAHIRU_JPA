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
public class Score {

    @Id @GeneratedValue
    private int no;

    private int categoryNo;

    private int userNo;

    private int postNo;

    private String code;

    private Timestamp regdate;

    private double tasteResult;

    private double platingResult;
}
