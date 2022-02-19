
package juego;

public class Bullet {


    private int posx = 0;
    private int posy = 0;
    private static final int SPEED = 15;
    private boolean fired = false;
    int incremento = 2;
    public Bullet(int posx, int posy, boolean fired) {
        this.posx = posx;
        this.posy = posy;
        this.fired = fired;
    }
    public int getPosx() {
        return posx;
    }
    public void setPosx(int posX) {
        this.posx = posX;
    }
    public int getPosy() {
        return posy;
    }
    public void setPosy(int posY) {
        this.posy = posY;
    }
    public void fire() {
        this.fired = true;
        
    }
    public void destroyed() {
        this.fired = false;
    }
    public void move() {
        if (fired){
            if(getPosy()==700) {
                setPosy(-20);
                destroyed();

        }else{
        posy=posy+incremento ;
        }
    }
    }
    public boolean devolverstatusbala()
    {
        return fired;
    }
}


