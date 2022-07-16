package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
public class PageVO {

    @Id @GeneratedValue
    private int start;

    private int end;

    private int no;

    private int categoryNo;

    private int postNo;

    private int replyNo;

    private int pageNo;

    private int numPage;

    private String searchWord;

    private String name;

    private String type;
}
