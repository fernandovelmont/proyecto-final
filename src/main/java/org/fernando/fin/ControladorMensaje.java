/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fernando.fin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fernandodaniel
 */
@RestController
@CrossOrigin
public class ControladorMensaje {

//caso post
@RequestMapping(value="/mensaje",method=RequestMethod.POST,
        headers={"application/json"})
public Estatus guardar(@RequestBody String json){
    System.out.println(json);
    Estatus e=new Estatus();
    e.setSuccess(true);
    return e;
}
}

