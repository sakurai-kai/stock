package test.comp;

import java.awt.Graphics;

import test.comp.Display.Panel;
 
import java.awt.Color;

public class ClassicParticle extends Particle{
    private double r = 100;
    public static final double MU = 1;
    public ClassicParticle(double x,double y,double z,int A){
        super(x,y,z,A*MU);
    }

    @Override
    public void paint(Graphics g,Panel panel) {
        panel.fillOval(g,this.xyz,this.r,super.color);
    }
    
}
/*
<br>
<br>
<br>
<sum=import java.time.format.TextStyle;simhei
*/

