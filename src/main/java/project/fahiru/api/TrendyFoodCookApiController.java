package project.fahiru.api;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fahiru.domain.TrendyFoodCook;
import project.fahiru.dto.TrendySearch;
import project.fahiru.repository.TrendyFoodCookRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TrendyFoodCookApiController {

    TrendyFoodCookRepository trendyFoodCookRepository;

    @GetMapping("/api/trendy/list")
    public String list(TrendySearch trendySearch, Model model ){
        List<TrendyFoodCook> trendyFoodCookList = trendyFoodCookRepository.findAll(trendySearch);
        model.addAttribute("trendyFoodCookList",trendyFoodCookList);

        return "trendy/foodCookList";
    }

    @GetMapping("/api/trendy/view/{cookNo}")
    public String view(@PathVariable Long cookNo, Model model){

        return "trendy/foodCookView/"+cookNo;
    }

    @PostMapping("/api/trendy")
    public String saveTrendy(TrendyFoodCook trendyFoodCook){
        trendyFoodCookRepository.save(trendyFoodCook);
        return "redirect:/api/trendy/"+trendyFoodCook.getNo();
    }

    @DeleteMapping("/api/trendy/{cookNo}")
    public String deleteTrendy(@PathVariable Long cookNo){

        return "redirect:/api/trendy/list";
    }

    @PostMapping("/api/trendy/{cookNo}")
    public String updateTrendy(@PathVariable Long cookNo, TrendySearch trendySearch){


        return "redirect:/api/trendy/view/"+cookNo;
    }

}

