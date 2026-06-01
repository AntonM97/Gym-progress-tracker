package cc.hiknomore.gym_progress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gym-progress/just-do-it")
public class JustDoItController {

    @GetMapping
    public String showJustDoIt() {
        return "just-do-it";
    }
    
}
