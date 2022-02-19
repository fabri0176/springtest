package com.nfp.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class InitController {
       
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String helloWorld(Model model) {
        String msg = "Hola mundo desde variables";
        log.info("Ejecutando controlador SPRING MVC");

        model.addAttribute("msg", msg);
        model.addAttribute("saludo", saludo);
        return "index";
    }

}
