package cc.hiknomore.gym_progress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gym-progress")
public class JustDoItController {

    @GetMapping("/justdoit")
    public String showJustDoIt() {
        return "just-do-it";
    }
    
}
