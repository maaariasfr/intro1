package UI.video;

import javax.swing.*;
import java.awt.*;

public class Contenedor extends JComponent {
    
    
    static JLabel label;
    static int columna=3;
    static int fila=195;
    static int numero=1;
    
    
    Contenedor(JLabel label){
        this.label=label;
        
        setBounds(0, 0, label.getWidth(), label.getHeight());
    
    }
    
    public void paint(Graphics g){
        ImageIcon imagen= new ImageIcon(new ImageIcon(getClass().getResource("imagenes/jugadorPinguino.png")).getImage());
        g.drawImage(imagen.getImage(), columna, fila, 206, 356, null);
    
    }
    
    static Thread hilo= new Thread()
    {
        public void run()
        {
        
        try
        {
            while(true)
            {
            label.repaint();
            columna+=10;
            hilo.sleep(100);
            }
                    
                    }catch(Exception ex){
                    System.out.println(ex);
                    }
        }
        
        
    
    
    
};
       
public static void mover(){

    if(!hilo.isAlive()){
        hilo.start();
    
    }
        columna=3;
    

}

}