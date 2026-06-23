/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loansys.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import loansys.view.Cambio_de_rol;
import loansys.view.Modal_cambio_de_rol;


/**
 *
 * @author juans
 */
public class ControladorCambio_de_rol  implements ActionListener {
    public Cambio_de_rol cambio_de_rol ;
    public Modal_cambio_de_rol modal;
    
    public ControladorCambio_de_rol( Cambio_de_rol cambio_de_rol, Modal_cambio_de_rol modal){
        this.cambio_de_rol = cambio_de_rol;
        this.modal = modal;
        this.cambio_de_rol.botonC.addActionListener(this);
        this.modal.cancelar.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cambio_de_rol.botonC) {

            int fila = cambio_de_rol.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(cambio_de_rol, "Debes de selecionar un usuario para cambiar su informacion ","", JOptionPane.WARNING_MESSAGE);
            } else {
                CargarModal(modal);
            }
        }
         if (e.getSource() == modal.cancelar) {
                    
                    modal.dispose();
                    JOptionPane.showMessageDialog(null, "No se registro ningun cambio","", JOptionPane.WARNING_MESSAGE );
                }
    }
   
    
 public void CargarModal(Modal_cambio_de_rol modal){
            modal.setVisible(true);
                modal.setSize(450, 350);
                modal.setLocationRelativeTo(null);
                modal.setModal(true);
 
        
}
}