package vkarpii.ua.scientificjournal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("scientific-journal")
public class TestController {

    @GetMapping("/")
    public String index(Model model) {
        //model.addAttribute("cases",cases);
        return "pages/index";
    }
}
