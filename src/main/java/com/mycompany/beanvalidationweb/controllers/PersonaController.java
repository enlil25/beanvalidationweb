/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beanvalidationweb.controllers;

import com.mycompany.beanvalidationweb.model.Persona;
import com.mycompany.beanvalidationweb.model.Profesor;
import com.mycompany.beanvalidationweb.utiles.FacesUtil;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Validator;

/**
 *
 * @author cesar
 */
@Named
@RequestScoped
public class PersonaController {

    @Inject
    private Persona persona;
    @Resource
    private Validator validator;
    
    @Inject
    private Profesor profesor;
    
    
    
    

    public void registrarPersona() {

        //se valid persona antes de guardar en la base de datos
//        Set<ConstraintViolation<Persona>> violations = validator.validate(persona, Default.class);
//        if (violations.size() > 0) {
//            for (ConstraintViolation violation : violations) {
//                FacesUtil.agregarMensajeError("verifique la validacion", violation.getMessage());
//            }
//        } else {
//            FacesUtil.agregarMensajeInfo("se registro correctamente", "se registro correctamente");
//        }
     FacesUtil.agregarMensajeInfo("se registro correctamente", "se registro correctamente");
    }
    
    public void registrarProfesor(){
      FacesUtil.agregarMensajeInfo("se registro correctamente", "se registro correctamente");  
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    
    
}
