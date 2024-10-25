package spring.sec.demo.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/demo-controller")
public class DemoController {

    @GetMapping(path = "/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from safe endpoint :)");
    }
}
