package juego;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static boolean haChocado=false;
    public static void main (String[] args){
        JFrame miVentana = new JFrame( "Running Spider") ;
        Juego game = new Juego();
        miVentana.add(game);
        miVentana.setSize ( 780, 708);
        miVentana.setVisible(true);
        miVentana.setResizable( false) ;
        miVentana.setLocationRelativeTo( null);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true){
            if(haChocado | Piedras.nivel==2)
            {
                 if(Piedras.nivel==5){
                JOptionPane.showMessageDialog(null, "Ganaste, Feliz");
                }
                int reiniciaJuego=JOptionPane.showConfirmDialog(null, "Haz Perdido, "+"2Quieres reiniciar el juego ?", "Perdiste ! !!",JOptionPane.YES_NO_OPTION);
                 if(reiniciaJuego==0) {
                    reiniciaValores();
                 }else if(reiniciaJuego==1){
                 System.exit(0) ;
                }
            }

            try{
            Thread.sleep (10) ;
            }catch (InterruptedException ex) {
            System.out.println (ex. toString ());
            game.repaint () ;

        }
        }
        }
        public static void reiniciaValores () {
            Piedras. xRoca1=600;
            Piedras. yRoca1=700;
            Piedras.xRoca2=700;
            Piedras. yRoca2=100;
            Piedras. xRoca3=-20;
            Piedras. yRoca3=600;
            Piedras. xRoca4=300;
            Piedras.yRoca4=-20;
            Insecto.x=10;
            Insecto. y=10;
            Piedras.nivel=1;
            haChocado=false;
            Piedras.puntos=0;
        }
}
