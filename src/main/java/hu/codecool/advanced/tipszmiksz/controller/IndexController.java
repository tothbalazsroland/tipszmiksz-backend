package hu.codecool.advanced.tipszmiksz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String index(){
        log.info("Got a get a request");
        return "I am working as expected";
    }

}
