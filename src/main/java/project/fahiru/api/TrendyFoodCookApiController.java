package project.fahiru.api;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.fahiru.domain.TrendyFoodCook;
import project.fahiru.repository.TrendyFoodCookRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TrendyFoodCookApiController {

    TrendyFoodCookRepository trendyFoodCookRepository;

    @GetMapping("/api/trendy/list")
    public String list(Model model){
        List<TrendyFoodCook> trendyFoodCookList = trendyFoodCookRepository.findAll();
        model.addAttribute("trendyFoodCookList",trendyFoodCookList);

        return "trendy/foodCookList";
    }

    @GetMapping("/api/trendy/view/{cookNo}")
    public String view(@PathVariable Long cookNo, Model model){

        return "trendy/foodCookView/"+cookNo;
    }

}

