package test.lib;

import test.comp.Control;
import test.comp.Display;

public class View  {
    private Control con;
    private Display dis;
    public View(){
        this.con = new Control("control panel");
        this.dis = new Display("display");
        con.print();
    }
}
