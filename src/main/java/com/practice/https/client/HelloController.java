package com.practice.https.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Luo Bao Ding
 * @since 2018/11/7
 */
@RestController
public class HelloController {
    private final RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/https")
    public String helloHttps(){
        return restTemplate.getForObject("https://localhost:8443/test", String.class);
    }

    @RequestMapping("/http")
    public String helloHttp(){
        return restTemplate.getForObject("http://localhost:8090/test", String.class);
    }


}
