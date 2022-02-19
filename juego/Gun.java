package juego;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Gun {
    private int posx = 0;
    private int posy = 0;
    private static final int SPEED = 15;
    private boolean fired = false;
    Insecto bicho =new Insecto();
    public static int x=10, y=10;
    Bullet bullete =new Bullet(posx, posx, fired);
    public void paint(Graphics g) {
        ImageIcon bullet = new ImageIcon(getClass().getResource("../images/bala.png"));
        g.drawImage(bullet.getImage () ,bicho.getPOsx()+20,bullete.getPosy()+20, 50, 50, null) ;
    }
    public void keyPressed (KeyEvent e){
    if(e.getKeyCode ()==32){
         fired=true;
         bullete.fire();
         System.out.println("espacio");
        }
    }
    public Ellipse2D getBoundsBala(){
        return new Ellipse2D.Double(posx+10, posy+30, 80, 50) ;
    }
    public boolean llegaFinal() {
        Rectangle cuadrado=new Rectangle (520, 520, 110, 110) ;
        Area cuadradoArea=new Area(cuadrado) ;
        return cuadradoArea.contains(getBoundsBala().getBounds()) ;
    }
    public boolean disparado(){
      return bullete.devolverstatusbala();
    }
    public void mover()
    {
        bullete.move();
    }
}

