package test.comp;

import java.awt.Graphics;

import test.lib.Linear;

public class ClassicParticle extends Particle{
    private double r = 10;
    @Override
    public void paint(Graphics g,double[][] rot,double rate) {
        double[] possition2d = Linear.mult(rot, xyz);
        if(possition2d.length != 2){
            System.err.println("In function paint() , an argment rot is not suitable size .");
        }
        g.fillOval((int)(rate*possition2d[0]),(int)(rate*possition2d[1]), (int)(rate*r), (int)(rate*r));

    }
    
}
/*
<br>
<br>
<br>
<sum=import java.time.format.TextStyle;simhei
*/

