/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loansys.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import loansys.view.Cambio_de_rol;
import loansys.view.Inicio_Loansys_administrador;
import loansys.view.Modal_Modificar_Usuario;
import loansys.view.Modal_Usuarios_Activos;
import loansys.view.Modal_cambio_de_rol;
import loansys.view.Modal_registrar_usuario;
import loansys.view.ModificarUsuario;
import loansys.view.Plantilla_Administrador;
import loansys.view.Registro_de_usuario;
import loansys.view.Usuarios_activos;

/**
 *
 * @author juans
 */
public class ControladorBotones implements ActionListener {

    private boolean vali = false;
    private boolean visible = false;
    
    
    Inicio_Loansys_administrador inicio = new Inicio_Loansys_administrador();
    
    // usuarios activos o inactivos
    Usuarios_activos usActivo = new Usuarios_activos();
    Modal_Usuarios_Activos modalUsu = new Modal_Usuarios_Activos();
    
    // modificar usuarios
    ModificarUsuario modificarUsuario = new ModificarUsuario();
    Modal_Modificar_Usuario modal_modifi = new Modal_Modificar_Usuario();
    
  //gestion de roles
   Cambio_de_rol  cambio_de_rol = new Cambio_de_rol();
   Modal_cambio_de_rol  modalRol = new  Modal_cambio_de_rol();
   
   //registrar usuario
     Registro_de_usuario registro_de_usuario = new Registro_de_usuario();
    Modal_registrar_usuario modalRigistrar = new Modal_registrar_usuario();
    
    //controladores                 
    ControladorUsuarioActivo controladorUsuarioActivo;
    ControladorModificarUsuario controladorModificarUsuario;
    ControladorCambio_de_rol controladorCambio_de_rol;
    Controlador_registro_usuario controlador_registro_usuario;

    public ControladorBotones(Inicio_Loansys_administrador inicio) {
        this.inicio = inicio;

        //------Activar boton inicio----------//
        this.inicio.activacion_usuario.addActionListener(this);
        this.inicio.modificar.addActionListener(this);
        this.inicio.gestion_roles.addActionListener(this);
        this.inicio.registrar_usuario.addActionListener(this);

        //----fin inicio_---------------//
        
        //-------activar boton usuarioActivos ---------//
        this.usActivo.binicio.addActionListener(this);
        this.usActivo.modificar.addActionListener(this);
        this.usActivo.gestion_roles.addActionListener(this);
        this.usActivo.registrar_usuario.addActionListener(this);
        //------fin usaActivo

        //------modificra usuario-----------//
        this.modificarUsuario.binicio.addActionListener(this);
        this.modificarUsuario.activacion_usuario.addActionListener(this);
       this.modificarUsuario.gestion_roles.addActionListener(this);
        this.modificarUsuario.registrar_usuario.addActionListener(this);
        
        
        //--------cambio de rol ---------------//
         this.cambio_de_rol.binicio.addActionListener(this);
        this.cambio_de_rol.activacion_usuario.addActionListener(this);
        this.cambio_de_rol.registrar_usuario.addActionListener(this);
       this.cambio_de_rol.modificar.addActionListener(this);
        
        
        //------registrar usuario------------//
         this.registro_de_usuario.binicio.addActionListener(this);
        this.registro_de_usuario.activacion_usuario.addActionListener(this);
       this.registro_de_usuario.gestion_roles.addActionListener(this);
         this.registro_de_usuario.modificar.addActionListener(this);


        //-------fin mdificar usuario--------//
        controladorUsuarioActivo = new ControladorUsuarioActivo(usActivo, modalUsu);
        controladorModificarUsuario = new ControladorModificarUsuario(modal_modifi, modificarUsuario);
        controladorCambio_de_rol = new ControladorCambio_de_rol(cambio_de_rol,modalRol);
        controlador_registro_usuario = new Controlador_registro_usuario(registro_de_usuario,modalRigistrar);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // ----------------menu_Inicio -----------------------------------//
        if (e.getSource() == inicio.activacion_usuario) {
            CargarActivacionUsuario(usActivo);
            inicio.dispose();
        }
        if (e.getSource() == inicio.modificar) {
            CargarModificarUsuario(modificarUsuario);
            inicio.dispose();
        }
        if(e.getSource()==inicio.gestion_roles){
            CargarCambioDeRol(cambio_de_rol);
            inicio.dispose();
        }
        if(e.getSource()==inicio.registrar_usuario){
            CargarRigistroDeUsuario(registro_de_usuario);
            inicio.dispose();
        }
        //----------- menu_fin------------///
        
        
        //--------menu_activo--------------//
        if (e.getSource() == usActivo.binicio) {
            CargarInicio(inicio);
            usActivo.dispose();
        }
        if (e.getSource() == usActivo.modificar) {
            CargarModificarUsuario(modificarUsuario);
            usActivo.dispose();
        }
        
          if(e.getSource()==usActivo.gestion_roles){
            CargarCambioDeRol(cambio_de_rol);
            usActivo.dispose();
        }
        if(e.getSource()==usActivo.registrar_usuario){
            CargarRigistroDeUsuario(registro_de_usuario);
            usActivo.dispose();
        }
        //---------menu_fin---------------//

        //---------modificar_usuario------------//
        if (e.getSource() == modificarUsuario.binicio) {
            CargarInicio(inicio);
            modificarUsuario.dispose();
        }

        if (e.getSource() == modificarUsuario.activacion_usuario) {
            CargarActivacionUsuario(usActivo);
            modificarUsuario.dispose();
        }
               if(e.getSource()==modificarUsuario.gestion_roles){
            CargarCambioDeRol(cambio_de_rol);
            modificarUsuario.dispose();
        }
        if(e.getSource()==modificarUsuario.registrar_usuario){
            CargarRigistroDeUsuario(registro_de_usuario);
            modificarUsuario.dispose();
        }
        //-----------cambio de rol---------------//
          if (e.getSource() == cambio_de_rol.binicio) {
            CargarInicio(inicio);
            cambio_de_rol.dispose();
        }

        if (e.getSource() == cambio_de_rol.activacion_usuario) {
            CargarActivacionUsuario(usActivo);
            cambio_de_rol.dispose();
        }
               if(e.getSource()==cambio_de_rol.modificar){
            CargarModificarUsuario(modificarUsuario);
            cambio_de_rol.dispose();
        }
        if(e.getSource()==cambio_de_rol.registrar_usuario){
            CargarRigistroDeUsuario(registro_de_usuario);
            cambio_de_rol.dispose();
        }
        
        //---------registro de usuario------------///
           if (e.getSource() == registro_de_usuario.binicio) {
            CargarInicio(inicio);
            registro_de_usuario.dispose();
        }

        if (e.getSource() == registro_de_usuario.activacion_usuario) {
            CargarActivacionUsuario(usActivo);
            registro_de_usuario.dispose();
        }
               if(e.getSource()==registro_de_usuario.modificar){
            CargarModificarUsuario(modificarUsuario);
            registro_de_usuario.dispose();
        }
        if(e.getSource()==registro_de_usuario.gestion_roles){
            CargarCambioDeRol(cambio_de_rol);
            registro_de_usuario.dispose();
        }

    }

    //------Metodos para cargar las view----------//
    public void CargarInicio(Inicio_Loansys_administrador inicio) {
        inicio.setVisible(true);
        inicio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void CargarActivacionUsuario(Usuarios_activos usActivo) {
        usActivo.setVisible(true);
        usActivo.binicio.setBackground(Color.white);
        usActivo.setExtendedState(JFrame.MAXIMIZED_BOTH);
        usActivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void CargarModificarUsuario(ModificarUsuario modificarUsuario) {
        modificarUsuario.setVisible(true);
        modificarUsuario.activacion_usuario.setBackground(Color.white);
        modificarUsuario.binicio.setBackground(Color.white);
        modificarUsuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
        modificarUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void CargarCambioDeRol(Cambio_de_rol cambio_de_rol){
         cambio_de_rol.setVisible(true);
        cambio_de_rol.activacion_usuario.setBackground(Color.white);
        cambio_de_rol.binicio.setBackground(Color.white);
        cambio_de_rol.modificar.setBackground(Color.white);
        cambio_de_rol.setExtendedState(JFrame.MAXIMIZED_BOTH);
        cambio_de_rol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public void CargarRigistroDeUsuario(Registro_de_usuario registro_de_usuario){
           registro_de_usuario.setVisible(true);
        registro_de_usuario.activacion_usuario.setBackground(Color.white);
        registro_de_usuario.binicio.setBackground(Color.white);
        registro_de_usuario.modificar.setBackground(Color.white);
        registro_de_usuario.gestion_roles.setBackground(Color.white);
        registro_de_usuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
        registro_de_usuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
