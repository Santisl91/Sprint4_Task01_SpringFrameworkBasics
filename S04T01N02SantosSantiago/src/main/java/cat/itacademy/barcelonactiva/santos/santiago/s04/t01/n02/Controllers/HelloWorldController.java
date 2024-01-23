package cat.itacademy.barcelonactiva.santos.santiago.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "HelloWorld")
    public String saludo1(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hi " + nom + ". You are running a Gradle project.";
    }

    @RequestMapping(value="HelloWorld2/{nom}")
    public  String saludo2(@PathVariable(required = false) String nom) {
        return "Hi " + nom + ". You are running a Gradle project.";
    }

}
