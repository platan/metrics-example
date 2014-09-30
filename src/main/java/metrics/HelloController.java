package metrics;

import com.codahale.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Timed
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
