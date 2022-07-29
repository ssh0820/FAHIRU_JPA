package project.fahiru.api;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.fahiru.domain.TrendyFoodCook;
import project.fahiru.repository.TrendyFoodCookRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TrendyFoodCookApiController {

    TrendyFoodCookRepository trendyFoodCookRepository;

    @GetMapping("/api/trendyList")
    public String list(Model model){
        List<TrendyFoodCook> trendyFoodCookList = trendyFoodCookRepository.findAll();
        model.addAttribute("trendyFoodCookList",trendyFoodCookList);

        return "trendy/foodCookList";
    }

}

