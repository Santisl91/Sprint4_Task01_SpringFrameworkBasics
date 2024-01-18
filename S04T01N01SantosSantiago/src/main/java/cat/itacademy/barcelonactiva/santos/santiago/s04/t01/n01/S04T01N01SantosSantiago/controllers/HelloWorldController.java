package cat.itacademy.barcelonactiva.santos.santiago.s04.t01.n01.S04T01N01SantosSantiago.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String greeting(@RequestParam(name = "Santi", defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Maven project.";
    }
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greeting2(@PathVariable(name = "Santiago", required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hello, " + name + ". You are running a Maven project.";
    }
}