package fit.se.firstService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RetryTemplate retryTemplate;

    @Retryable
    public String callSecondService() {
        return retryTemplate.execute(context -> restTemplate.getForObject("http://localhost:8081/api", String.class));
    }
}

