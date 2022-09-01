package project.fahiru.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import project.fahiru.domain.Fahes;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class FahesResponseDto {

    private Long no;
    private String name;
    private String explanation;
    private String regUser;
    private LocalDateTime regdate;

    public FahesResponseDto(Fahes fahes){
        this.no = fahes.getNo();
        this.name = fahes.getName();
        this.explanation = fahes.getExplanation();
        this.regUser = fahes.getRegistInformation().getRegUser();
        this.regdate = fahes.getRegistInformation().getRegdate();
    }
}
