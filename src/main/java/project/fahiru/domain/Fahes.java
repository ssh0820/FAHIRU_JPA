package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
public class Fahes {

    @Id @GeneratedValue
    @Column(name = "fah_no")
    private Long no;

    private String name;

    private String explanation;

    private LocalDateTime regdate;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Users users;

    @OneToMany(mappedBy = "fahes")
    private List<CategoryFah> CategoryFah = new ArrayList<>();

    //fahes 수정( name, explanation )
    public void fahUpdate(String name, String explanation){
        this.name = name;
        this.explanation = explanation;
    }

    @OneToMany(mappedBy = "fahes")
    private List<FahesImg> fahesImgList = new ArrayList<>();
}
