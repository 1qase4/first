package cn.zchong.first.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
public class IndexController {

    @GetMapping("/test")
    public String test(String name) {
        String message = String.format("this is test method,name[%s]", name);
        log.info(message);
        return message;
    }

}

