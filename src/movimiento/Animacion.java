package movimiento;

import java.awt.Button;
import javax.swing.JButton;

/**
 *
 * @author USUARIO
 */
public class Animacion {
    final int max_x = 300;
    final int min_x = 0;
    final int y = 100;
    
    public Animacion() {
        
    }
    
    public void derecha(JButton boton){
        int x = 0;
        int y = 100;
        while(true){
            boton.setLocation(x,y);
            x +=10;
            try{
                Thread.sleep(200);
            }catch(Exception e){}
            if(x==max_x){
                
            }
        }
    }
    
    public JButton izquierda(JButton b){
        int x = 400;
        
        return b;
    }
}
