package com.nfp.springtest.controller;


import com.nfp.springtest.dao.IPersonDao;
import com.nfp.springtest.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class InitController {
    
    @Autowired(required = true)  
    private PersonService personService;
    
    @GetMapping("/")
    public String helloWorld(Model model) {
        log.info("Ejecutando controlador SPRING MVC");
        var persons = personService.personsList();
        log.info("Ejecutando controlador SPRING MVC 2");
        model.addAttribute("persons", persons);
        return "index";
    }

}
