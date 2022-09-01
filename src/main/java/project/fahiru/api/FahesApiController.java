package project.fahiru.api;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fahiru.domain.Fahes;
import project.fahiru.dto.FahesResponseDto;
import project.fahiru.dto.FahesSearch;
import project.fahiru.repository.FahesRepository;
import project.fahiru.service.FahesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FahesApiController {

    FahesService fahesService;

}

