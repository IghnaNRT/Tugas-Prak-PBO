package id.ac.uin.ighna.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api")
@RestController

public class IndexController {
    @GetMapping("/hello")
    public String hello() {
        return
                "Selamat belajar Spring-boot!";
    }
}
