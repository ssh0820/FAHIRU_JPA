package project.fahiru.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.fahiru.domain.Fahes;
import project.fahiru.dto.FahesResponseDto;
import project.fahiru.dto.FahesSaveDto;
import project.fahiru.dto.FahesSearch;
import project.fahiru.dto.FahesUpdateDto;
import project.fahiru.repository.FahesRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FahesService {

    private final FahesRepository fahesRepository;

    @Transactional
    public Long save(FahesSaveDto fahesSaveDto){
        return fahesRepository.save(fahesSaveDto);
    }

    public List<FahesResponseDto> fahList(FahesSearch fahesSearch){
        return fahesRepository.fahList(fahesSearch);
    }

    public FahesResponseDto fahView(Long fahNo){
        Fahes fahes = fahesRepository.findById(fahNo)
                .orElseThrow(()-> new IllegalArgumentException("해당 화씨를 찾을 수 없습니다."));
        return new FahesResponseDto(fahes);
    }

    public Long fahUpdate(Long fahNo, FahesUpdateDto fahesUpdateDto){
        Fahes fahes = fahesRepository.findById(fahNo).orElseThrow(()->new IllegalArgumentException("해당 화씨를 찾을 수 없습니다."+fahesUpdateDto.getName()));

        fahes.fahUpdate(fahesUpdateDto.getName(),fahesUpdateDto.getExplanation());
        return fahNo;
    }


}
