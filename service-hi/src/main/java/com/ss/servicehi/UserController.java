package com.ss.servicehi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user/add")
    public String home(@RequestParam(value = "name", defaultValue = "quentin") String name) {
        return "add user " + name + "success";
    }
}
