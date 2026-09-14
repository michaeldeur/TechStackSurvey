package backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World from Spring Boot!");
        return "index";
    }
}