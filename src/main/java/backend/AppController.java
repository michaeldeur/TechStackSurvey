package backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/")
    public String index(ModelMap model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }
}