package juego;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class Juego extends JPanel{
    //public static boolean haChocado=false;
    Piedras roca= new Piedras (this) ;
    Insecto bicho =new Insecto();
    Gun gun = new Gun();
    public Juego (){
        addKeyListener( new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e){
        }
        @Override
        public void keyPressed (KeyEvent e){
            bicho.keyPressed (e) ;
            gun.keyPressed(e);
            //System.out.println(e);
        }
        @Override
        public void keyReleased (KeyEvent e) {
        }
    });
    setFocusable(true);
    }
    @Override
    public void paint (Graphics g){
    super.paint (g);
    ImageIcon tela = new ImageIcon(getClass ().getResource ("../images/tela.png")); //fondo
    g.drawImage( tela.getImage(),0,0, getWidth(),getHeight (), this);
    Font score = new Font("Arial" ,Font.BOLD, 25) ;
    g.setFont (score);
    g.setColor(Color.blue) ;
    g.drawString ("Puntaje: "+roca.obtenerPuntos (), 520, 50) ;
    bicho.paint(g) ;
    roca.paint(g);
    if(gun.disparado()){


        gun.paint(g);
        gun.mover();
    }
    roca.mover();
    g.dispose ();
    repaint();
    }

}
