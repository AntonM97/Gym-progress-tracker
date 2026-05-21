package cc.hiknomore.gym_progress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    
    @GetMapping("/gym-progress")
    public String showHome() {
        return "index";
    }
    
    @GetMapping("/")
    public String showSiteHome() {
        return "redirect:/gym-progress";
    }

}
