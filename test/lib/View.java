package test.lib;

import test.comp.Frame;

public class View  {
    private Frame frame;
    public View(){
        frame = new Frame("title");
        frame.print();
    }
}
