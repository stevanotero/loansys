/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loansys.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import loansys.view.Inicio_Loansys;
import loansys.view.Modal_Usuarios_Activos;
import loansys.view.Plantilla;
import loansys.view.Usuarios_activos;

/**
 *
 * @author juans
 */
public class ControladorUsuarioActivo implements ActionListener {

    private Usuarios_activos usActivo;
  
private Modal_Usuarios_Activos modal;
  
    public ControladorUsuarioActivo(Usuarios_activos usActivo, Modal_Usuarios_Activos modal) {
        this.modal=modal;
        this.usActivo = usActivo;
        this.usActivo.botonA.addActionListener(this);
       this.modal.cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == usActivo.botonA) {

            int fila = usActivo.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(usActivo, "Debes de selecionar un usuario para cambiar su informacion ","", JOptionPane.WARNING_MESSAGE);
            } else {
                CargarModal(modal);
            }
        }
         if (e.getSource() == modal.cancelar) {
                    
                    modal.dispose();
                    JOptionPane.showMessageDialog(null, "No se registro ningun cambio","", JOptionPane.WARNING_MESSAGE );
                }
    }
   
    
 public void CargarModal(Modal_Usuarios_Activos modal){
            modal.setVisible(true);
                modal.setSize(450, 350);
                modal.setLocationRelativeTo(null);
                modal.setModal(true);
 }

}
