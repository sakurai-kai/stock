package test.comp;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;

public class  Frame extends JFrame{
    private Button button;
    public Frame(String title){
        
        super(title);
        this.button = new Button("button");
        this.add(button);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public void print(){
        System.out.println(this.getTitle());
    }
}