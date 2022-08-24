package project.fahiru.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class FahesSearch {

    private String name;
    private String explanation;

    public FahesSearch(String name, String explanation){
        this.name = name;
        this.explanation = explanation;
    }
}
