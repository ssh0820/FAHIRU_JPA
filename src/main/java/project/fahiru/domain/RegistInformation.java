package project.fahiru.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@RequiredArgsConstructor
@Getter
public class RegistInformation {

    private LocalDateTime regdate;
    private String regUser;

    public RegistInformation(LocalDateTime regdate, String regUser){
        this.regdate = regdate;
        this.regUser = regUser;
    }


}
