/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aida.babyplus.servicio;

import com.aida.babyplus.modelo.dao.UsuarioDAO;

/**
 *
 * @author Aida
 */
public class ServicioUsuarios {
    
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public void cambiarEstado(Integer id) {
        usuarioDAO.cambiarEstado(id);
    }
}
