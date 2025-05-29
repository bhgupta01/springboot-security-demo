package garg.bhawana.spring_security_demo;

import org.springframework.web.bind.annotation.RestController;

import garg.bhawana.spring_security_demo.models.Task;
import garg.bhawana.spring_security_demo.models.TaskStatus;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/home")
    public String visitHomePage() {
        logger.info("Received request for /home");
        return "Welcome to Task Tracker CLI";
    }

    @PostMapping("/add")
    public Task createTask(@RequestParam String description) {
        logger.info("Received request for /add with description="+description);
        return new Task(
                UUID.randomUUID(),
                description,
                TaskStatus.TODO,
                System.currentTimeMillis(),
                System.currentTimeMillis());
    }
}
