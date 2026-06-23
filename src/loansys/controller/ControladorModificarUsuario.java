/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loansys.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import loansys.view.Modal_Modificar_Usuario;
import loansys.view.Modal_Usuarios_Activos;
import loansys.view.ModificarUsuario;

/**
 *
 * @author juans
 */
public class ControladorModificarUsuario implements ActionListener {
    public ModificarUsuario modi ;
    public Modal_Modificar_Usuario modal;
    
    public ControladorModificarUsuario(Modal_Modificar_Usuario modal,ModificarUsuario modi ){
        this.modi=modi;
        this.modal = modal;
        this.modi.botonC.addActionListener(this);
        this.modal.cancelar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == modi.botonC) {

            int fila = modi.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(modi, "Debes de selecionar un usuario para cambiar su informacion ","", JOptionPane.WARNING_MESSAGE);
            } else {
                CargarModal(modal);
            }
        }
         if (e.getSource() == modal.cancelar) {
                    
                    modal.dispose();
                    JOptionPane.showMessageDialog(null, "No se registro ningun cambio","", JOptionPane.WARNING_MESSAGE );
                }
    }
   
    
 public void CargarModal(Modal_Modificar_Usuario modal){
            modal.setVisible(true);
                modal.setSize(450, 350);
                modal.setLocationRelativeTo(null);
                modal.setModal(true);
 }
        
}
