/*
 * Jireh Soft
 * Juan Manuel Flores.
 * jirehsoftwares.blogspot.com
 */
package clases;

import formularios.frmLogin;

/**
 *
 * @author Jireh
 */
public class JirehSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea el objeto datos
        Datos misDatos = new Datos();
        
        //Llama el formulario login
        frmLogin miLogin = new frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
