package usts.pycro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pycro
 * @version 1.0
 * 2023-04-08 11:37 AM
 */
@RestController
public class WorldController {
    @RequestMapping("/w")
    public String handle01() {
        return "World";
    }
}
