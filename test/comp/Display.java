package test.comp;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;

import test.lib.Linear;


public class  Display extends JFrame implements ActionListener{
    

    private Color bg = Color.black;
    private Panel panel;
    private transient Particle[] particles;
    public Display(String title){
        super(title);
        setParticles();
        this.panel = new Panel();
        this.add(this.panel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);


    }
    public void print(){
        System.out.println(this.getTitle());
    }
 
    private void setParticles(){
        this.particles = new Particle[1];
        this.particles[0] = new ClassicParticle(0,0,0,1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
    
    public class Panel extends JPanel{
        private double[][] rot = {{1,0,0},{1,2,0}};
        private double rate = 1;
        @Override
        public void paintComponent(Graphics g){
            g.setColor(Display.this.bg);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.blue);
            Display.this.particles[0].paint(g,this);
        }
        public void fillOval(Graphics g,double[] xyz,double r,Color color){
            if(xyz.length != 3){
                System.err.println("In function fillOval() , an array argment xyz must be 3 demensions .");
                System.exit(1);
            }
            double[] possition2d = Linear.mult(this.rot, xyz);
            if(possition2d.length != 2){
                System.err.println("In function fillOval() , an argment rot is not suitable size .");
                System.exit(1);
            }
            g.setColor(color);
            int modr = (int)(rate*r);
            int modx = (int)(this.rate*possition2d[0]);
            int mody = (int)(this.rate*possition2d[1]);
            g.fillOval((this.getWidth()-modr)/2+modx,(this.getHeight()-modr)/2+mody,modr,modr);

        
        }
    }
}