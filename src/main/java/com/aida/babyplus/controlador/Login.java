/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aida.babyplus.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.aida.babyplus.modelo.entidades.Usuario;
import com.aida.babyplus.servicio.ServicioLogin;
import java.io.InvalidClassException;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Aida
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    
    private ServicioLogin servicioLogin;

    @Override
    public void init() throws ServletException {
        super.init();
        servicioLogin = new ServicioLogin();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        throw new InvalidClassException("Probando");
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
//        HttpSession session = request.getSession();
//
//        try {
//            Usuario usuario = servicioLogin.comprobarUsuario(login, password);
//
//            if (session != null) {
//                if (usuario != null) {
//                    session.setAttribute("usuario", usuario);
//                    String paginaIndex = (request.getContextPath() + "/babyplus/jsp/privado/[ROL]/principal.jsp").replace("[ROL]", String.valueOf(usuario.getRol().getDescripcion()).toLowerCase());
//                    response.sendRedirect(paginaIndex);
//                } else {
//                    session.setAttribute("error", "login.error.incorrecto");
//                    response.sendRedirect(request.getContextPath() + "/babyplus/jsp/paginaLogin.jsp");
//                }
//            }
//        } catch (Exception e) {
//            session.setAttribute("error", "error.generico");
//            response.sendRedirect(request.getContextPath() + "/babyplus/jsp/paginaLogin.jsp");
//        }
    }
}
