/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beanvalidationweb.utiles;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author cesar
 */
public class FacesUtil {
    
    public static void agregarMensajeInfo(String resumen,String detalle){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,resumen,detalle));
    }
    
    public static void agregarMensajeError(String resumen,String detalle){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,resumen,detalle));
    }
    public static void agregarMensajeWarn(String resumen,String detalle){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,resumen,detalle));
    }
}
