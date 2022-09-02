package project.fahiru.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class FahesUpdateDto {

    private String name;
    private String explanation;

    public FahesUpdateDto(String name, String explanation){
        this.name = name;
        this.explanation = explanation;
    }
}
