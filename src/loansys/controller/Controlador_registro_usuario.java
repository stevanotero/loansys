/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loansys.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import loansys.view.Modal_registrar_usuario;
import loansys.view.Registro_de_usuario;



/**
 *
 * @author juans
 */
public class Controlador_registro_usuario  implements ActionListener {
    
        private Registro_de_usuario registro_usuario;
        private Modal_registrar_usuario modal;

  
    public Controlador_registro_usuario(Registro_de_usuario registro_usuario, Modal_registrar_usuario modal) {
        this.modal=modal;
        this.registro_usuario = registro_usuario;
        this.registro_usuario.botonRegistro.addActionListener(this);
       this.modal.cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registro_usuario.botonRegistro) {
                CargarModal(modal);
                
            }
        
         if (e.getSource() == modal.cancelar) {
                    modal.dispose();
                    JOptionPane.showMessageDialog(null, "No se registro ningun usuario","", JOptionPane.WARNING_MESSAGE );
                }
    }
   
    
 public void CargarModal(Modal_registrar_usuario modal){
            modal.setVisible(true);
                modal.setSize(450, 350);
                modal.setLocationRelativeTo(null);
                modal.setModal(true);
 }

}
