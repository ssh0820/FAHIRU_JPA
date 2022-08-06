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
import project.fahiru.repository.FahesRepository;
import project.fahiru.service.FahesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FahesApiController {

    FahesRepository fahesRepository;

    FahesService fahesService;

    @GetMapping("/api/fahes/list")
    public String list(Model model) {
        List<Fahes> fahesList = fahesRepository.findAll();
        model.addAttribute("fahesList", fahesList);
        return "fahesList";
    }

    @GetMapping("/api/fahes/view/{fahNo}")
    public String view(Model model,@PathVariable Long fahNo){
        Fahes fahes = fahesRepository.findOne(fahNo);
        model.addAttribute("fah",fahes);
        return "fahesView";
    }

    @PostMapping("/api/fahes")
    public String saveFah(Fahes fahes){
        fahesRepository.save(fahes);
        return "redirect:/api/fahes/"+fahes.getNo();
    }

    @DeleteMapping("/api/fahes/{fahNo}")
    public String deleteFah(@PathVariable Long fahNo){
        fahesRepository.deleteById(fahNo);
        return "redirect:/api/fahes/list";
    }

    @PutMapping("/api/fahes/{fahNo}")
    public String updateFahUpdate(@PathVariable Long fahNo,String name,String explanation){

        Fahes fahes = new Fahes(name,explanation);
        return "redirect:/api/fahes/view/"+fahNo;
    }

    @PatchMapping("/api/fahes/{fahNo}")
    public String patchFahPatch(@PathVariable Long fahNo, String name, String explanation){

        Fahes fahes =  fahesRepository.findOne(fahNo);
        fahes.setName(name);
        fahes.setExplanation(explanation);

        return "redirect:/api/fahes/view/"+fahNo;
    }

}

