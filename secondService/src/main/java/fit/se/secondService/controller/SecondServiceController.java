package fit.se.secondService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecondServiceController {
    
    @GetMapping("")
    public String secondServiceEndpoint() {
        return "Response from second service";
    }
}

