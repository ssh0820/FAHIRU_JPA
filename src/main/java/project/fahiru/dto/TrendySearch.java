package project.fahiru.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class TrendySearch {
    private Long Score;
    private String name;

    public TrendySearch(Long score, String name){
        this.Score = score;
        this.name = name;
    }

}
