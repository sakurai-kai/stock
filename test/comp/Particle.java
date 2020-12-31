package test.comp;

import java.awt.Graphics;

public abstract class Particle {
    protected double mass; 
    protected double[] xyz;

    public abstract void paint(Graphics g , double[][] rot , double rate);

    
}
