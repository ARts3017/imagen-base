/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagen.base.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arturo
 */

@RestController
@RequestMapping(value="/demo")
public class Controller {
    
    @GetMapping(value="/main")
    public String getMain()
    {
        return "MAIN.....";
    }
    
}
