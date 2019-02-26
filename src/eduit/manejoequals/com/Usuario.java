/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.manejoequals.com;

/**
 *
 * @author EducaciónIT
 */
public class Usuario {
    public final String id;
    public final String nombre;

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object obj) {
        Usuario usu = (Usuario)obj;
        
        if (!this.id.equals(usu.id)) {
            return false;
        }
        
        if (!this.nombre.equals(usu.nombre)) {
            return false;
        }
        
        return true;
    }
}
