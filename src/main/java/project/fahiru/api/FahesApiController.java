package project.fahiru.api;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fahiru.domain.Fahes;
import project.fahiru.repository.FahesRepository;
import project.fahiru.service.FahesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FahesApiController {

    FahesRepository fahesRepository;

    @GetMapping("/api/fahesList")
    public String list(Model model) {
        List<Fahes> fahesList = fahesRepository.findAll();
        model.addAttribute("fahesList", fahesList);
        return "fahes/fahesList";
    }

    @PostMapping("/api/fahes")
    public String insertFah(Fahes fahes){
        fahesRepository.save(fahes);
        return "redirect:/fahesList";
    }

    @DeleteMapping("/api/fahes/{fahNo}")
    public String deleteFah(@PathVariable Long fahNo){
        fahesRepository.deleteById(fahNo);
        return "redirect:/fahesList";
    }

}

