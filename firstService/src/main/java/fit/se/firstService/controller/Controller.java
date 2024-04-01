package fit.se.firstService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.se.firstService.service.Service;
import io.github.bucket4j.Bucket;


@RestController
public class Controller {

    @Autowired
    private Service service;
    
    @Autowired
    private Bucket bucket;

    @GetMapping("/call")
    public String callSecondService() {
    	System.out.println("Call second service");
        return service.callSecondService();
    }
    
    @GetMapping("/endpoint")
    public String myEndpoint() {
        if (bucket.tryConsume(1)) {
            return "Request processed successfully";
        } else {
            return "Rate limit exceeded";
        }
    }
}
