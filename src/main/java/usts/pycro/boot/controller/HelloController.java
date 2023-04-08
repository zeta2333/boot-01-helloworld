package usts.pycro.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usts.pycro.boot.bean.Car;

/**
 * @author Pycro
 * @version 1.0
 * 2023-04-07 9:18 PM
 */
//@Controller
//@ResponseBody

@RestController
public class HelloController {

    @Autowired
    private Car car;

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2!" + "你好啊";
    }

    @RequestMapping("/car")
    public Car car() {
        return car;
    }
}
