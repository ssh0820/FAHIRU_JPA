package project.fahiru.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import project.fahiru.domain.Fahes;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class FahesSaveDto {

    private Long no;
    private String name;
    private String explanation;
    private Long regUser;
    private LocalDateTime regdate;

    public FahesSaveDto(Fahes fahes){
        this.no = fahes.getNo();
        this.name = fahes.getName();
        this.explanation = fahes.getExplanation();
        this.regUser = fahes.getUsers().getNo();
        this.regdate = fahes.getRegdate();
    }
}
