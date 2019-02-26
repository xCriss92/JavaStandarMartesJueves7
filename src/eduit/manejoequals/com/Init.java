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
public class Init {
    public static void main(String ...params) {
        Usuario u1 = new Usuario("1","2");
        Usuario u2 = new Usuario("1", "3");
        
        u1.equals(u2);
    }
}
