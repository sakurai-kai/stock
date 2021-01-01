package test.comp;

import java.awt.Graphics;

import test.comp.Display.Panel;

import java.awt.Color;

public abstract class Particle {
    protected Color color = new Color(50,200,100);
    protected double mass; 
    protected double[] xyz = new double[3];

    protected Particle(double x,double y,double z,double mass){
        this.mass = mass;
        this.xyz[0] = x;
        this.xyz[1] = y;
        this.xyz[2] = z;

    }
    public abstract void paint(Graphics g,Panel panel);

    
}
