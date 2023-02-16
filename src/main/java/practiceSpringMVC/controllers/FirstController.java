package practiceSpringMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";   //папка - first (все представления, относящиеся к одному контроллеру лежат в одной папке)
    }
    @GetMapping("/goodbye")
    public String goodbuePage(){
        return "first/goodbye";

    }
}
