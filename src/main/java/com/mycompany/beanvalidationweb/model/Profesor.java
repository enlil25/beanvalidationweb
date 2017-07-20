/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beanvalidationweb.model;

import com.mycompany.beanvalidationweb.utiles.ProfesorCheck;
import java.util.Date;
import javax.validation.constraints.AssertTrue;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author cesar
 */

public class Profesor extends Persona {

    @NotEmpty(groups = {ProfesorCheck.class})
    private String grado;
    @AssertTrue(groups = {ProfesorCheck.class})
    private boolean certificado;
    
    public Profesor(){}
    
    public Profesor(String nombre, String apellido, Date fechaNacimiento, String grado, boolean certificado) {
        super(nombre, apellido, fechaNacimiento);
        this.grado = grado;
        this.certificado = certificado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    @Override
    public String toString() {
        return "Profesor{" + "grado=" + grado + ", certificado=" + certificado + '}';
    }
    
    

}
