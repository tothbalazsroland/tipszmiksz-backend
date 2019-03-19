package hu.codecool.advanced.tipszmiksz.controller;

import hu.codecool.advanced.tipszmiksz.model.TipszmikszResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class IndexController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public TipszmikszResponse index(){
        TipszmikszResponse response = restTemplate.getForObject("http://127.0.0.1:5000/", TipszmikszResponse.class);
        return response;
    }

}
