package local.demonstration.socket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ITRex Group
 */

@RestController
@RequestMapping("/")
public class Hello {

    @GetMapping
    public String hello(){
        return "Hello world!";
    }
}
