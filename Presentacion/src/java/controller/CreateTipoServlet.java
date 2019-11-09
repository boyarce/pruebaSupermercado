/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cl.duoc.dej.entity.TipoEntity;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cl.duoc.dej.negocio.LoginNegocio;
import cl.duoc.dej.entity.UsuarioEntity;
import cl.duoc.dej.negocio.TipoNegocio;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.http.HttpSession;

/**
 *
 * @author boyarce
 */
public class CreateTipoServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(CreateTipoServlet.class.getName());
    private List<TipoEntity> tipos;
    private TipoNegocio tipoNegocio;

    public CreateTipoServlet() {
        try {
            tipoNegocio = new TipoNegocio();
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void createTipo(HttpServletRequest request, 
            HttpServletResponse response, boolean isGet)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        LOGGER.info("CREATE TIPO");
        HttpSession session = request.getSession();
        
        try {

            String id = request.getParameter("id");
            String nombre = request.getParameter("nombre");
            String error = validateForm(id, nombre);
            if(!isGet){                        
                if (!(error != null && !"".equals(error))) {
                    TipoEntity tipo = new TipoEntity();
                    tipo.setCodigo(Short.valueOf(id));
                    tipo.setNombre(nombre);
                    

                    tipoNegocio.crear(tipo);
                    session.setAttribute("errorCreateTipo", error);
                } else {
                    session.setAttribute("errorCreateTipo", error);
                }
            }else{
                session.setAttribute("errorCreateTipo", "");
            }

           // tipos = tipoNegocio.buscarTodo();

            session.setAttribute("tipos", tipos);            
            response.sendRedirect("jsp/mantenedor-tipo-empleado.jsp");

        } catch (NumberFormatException ex) {
            session.setAttribute("errorCreateTipo", "ID debe ser númerico");
            response.sendRedirect("jsp/mantenedor-tipo-empleado.jsp");
        } catch (Exception ex) {
            LOGGER.log(Level.WARNING, ex.getMessage(), ex);
        }
        
    }
    
    
    public String validateForm(String id, String nombre) {

        String error = !(id != null && !"".equals(id)) ? "<p class='text-sm-left'>Debe ingresar ID</p>" : "";
        error = error + (!(nombre != null && !"".equals(nombre)) ? "<p class='text-sm-left'>Debe ingresar NOMBRE</p>" : "");
        

        return error;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        createTipo(request, response, true);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        createTipo(request, response, true);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
