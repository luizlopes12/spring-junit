package br.com.luiz.controllers;

import br.com.luiz.SimpleMath;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    private final SimpleMath math = new SimpleMath();

    @GetMapping("/sum/{a}/{b}")
    public Double sum(@PathVariable String a, @PathVariable String b) {
        return math.sum(Double.parseDouble(a), Double.parseDouble(b));
    }

    @GetMapping("/sub/{a}/{b}")
    public Double sub(@PathVariable String a, @PathVariable String b) {
        return math.sub(Double.parseDouble(a), Double.parseDouble(b));
    }

    @GetMapping("/mul/{a}/{b}")
    public Double mul(@PathVariable String a, @PathVariable String b) {
        return math.mul(Double.parseDouble(a), Double.parseDouble(b));
    }

    @GetMapping("/div/{a}/{b}")
    public Double div(@PathVariable String a, @PathVariable String b) {
        return math.div(Double.parseDouble(a), Double.parseDouble(b));
    }
}
