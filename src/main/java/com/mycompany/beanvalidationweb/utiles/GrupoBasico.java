/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beanvalidationweb.utiles;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 *
 * @author cesar
 */
//@GroupSequence({Default.class,ProfesorCheck.class})
public interface GrupoBasico extends Default,ProfesorCheck{
    
}
