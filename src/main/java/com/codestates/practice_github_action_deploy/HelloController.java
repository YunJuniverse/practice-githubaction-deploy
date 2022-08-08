package com.codestates.practice_github_action_deploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String hello () {
        return "Hello World, Hello";
    }
}
