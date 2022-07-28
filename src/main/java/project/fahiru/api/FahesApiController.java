package project.fahiru.api;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fahiru.domain.Fahes;
import project.fahiru.repository.FahesRepository;
import project.fahiru.service.FahesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FahesApiController {

    FahesRepository fahesRepository;

    @GetMapping("/fahes")
    public String list(Model model) {
        List<Fahes> fahesList = fahesRepository.findAll();
        model.addAttribute("fahesList", fahesList);
        return "fahes/fahesList";
    }

}

