package task.ignitisv2.swaggerdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SwaggerAPIController {
    @GetMapping("/")
    public ResponseEntity<String> greet() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    @PostMapping("/greet")
    public ResponseEntity<String> greet(@RequestBody String name) {
        return new ResponseEntity<String>("Hello, " + name, HttpStatus.OK);
    }
}
