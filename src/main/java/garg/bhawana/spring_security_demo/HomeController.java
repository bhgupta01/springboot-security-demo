package garg.bhawana.spring_security_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    
    @GetMapping("/home")
    public String visitHomePage() {
        return "Welcome to Task Tracker CLI";
    }
}
