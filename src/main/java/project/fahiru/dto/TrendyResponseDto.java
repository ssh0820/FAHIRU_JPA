package project.fahiru.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class TrendyResponseDto {

    private Long no;

    private String name;

    private Long Score;

    private LocalDateTime regdate;

    private String regUser;

    public TrendyResponseDto(Long no, String name,Long score, LocalDateTime regdate, String regUser){
        this.no = no;
        this.Score = score;
        this.name = name;
        this.regUser = regUser;
        this.regdate = regdate;
    }

}
