package project.fahiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.fahiru.domain.Fahes;
import project.fahiru.dto.FahesResponseDto;
import project.fahiru.dto.FahesSaveDto;
import project.fahiru.dto.FahesSearch;

import java.util.List;

public interface FahesRepository extends JpaRepository<Fahes, Long> {

    public Long save(FahesSaveDto fahesSaveDto);

    public List<FahesResponseDto> fahList(FahesSearch fahesSearch);

}
