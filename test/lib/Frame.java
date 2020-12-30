package test.lib;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class  Frame extends JFrame{
    Frame(String title){
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public void print(){
        System.out.println(this.getTitle());
    }
}