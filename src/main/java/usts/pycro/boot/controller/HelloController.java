package usts.pycro.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String handle01(@RequestParam(value = "name",defaultValue = "") String name) {
        return "Hello, Spring Boot 2!" + "<br/>你好："+name;
    }

    @RequestMapping("/car")
    public Car car() {
        return car;
    }
}
