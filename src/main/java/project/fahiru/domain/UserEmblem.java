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
public class UserEmblem {

    @Id @GeneratedValue
    private int no;
    private int userNo;
    private int emblemNo;
    private Timestamp regdate;
}
