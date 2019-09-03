package com.jardiano.oti.oti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EsqueceuSenhaController {
    @RequestMapping(value = "/esqueceu_senha")
    public String mundo(){

        return "esqueceu_senha";
    }
}
