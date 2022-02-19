package com.nfp.springtest;

import java.util.ArrayList;
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
        var persona = new Persona();
        persona.setNombres("Nestor Fabricio");
        persona.setApellidos("Parra Gonzalez");
        persona.setEmail("fabri@gmail.com");
        persona.setTelefono("315421236");

        var persona2 = new Persona();
        persona2.setNombres("Katherine");
        persona2.setApellidos("Riascos");
        persona2.setEmail("kriascos@gmail.com");
        persona2.setTelefono("2325365");
        
        var personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);
        

        model.addAttribute("msg", msg);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }

}
