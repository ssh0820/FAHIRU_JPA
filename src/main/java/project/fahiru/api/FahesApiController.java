package project.fahiru.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fahiru.dto.FahesResponseDto;
import project.fahiru.dto.FahesSaveDto;
import project.fahiru.dto.FahesSearch;
import project.fahiru.dto.FahesUpdateDto;
import project.fahiru.service.FahesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FahesApiController {

    FahesService fahesService;


    @GetMapping("/api/fahes/list")
    public List<FahesResponseDto> fahList(FahesSearch fahesSearch){
        return fahesService.fahList(fahesSearch);
    }

    @GetMapping("/api/fahes/view/{fahNo}")
    public FahesResponseDto fahView(@PathVariable Long fahNo){
        return fahesService.fahView(fahNo);
    }

    @PostMapping("/api/fahes/")
    public Long fahSave(FahesSaveDto fahesSaveDto){
        return fahesService.save(fahesSaveDto);
    }

    @PostMapping("/api/fahes/{fahNo}")
    public Long fahUpdate(@PathVariable Long fahNo,FahesUpdateDto fahesUpdateDto){
        return fahesService.fahUpdate(fahNo,fahesUpdateDto);
    }
}

