package package1;

import javax.swing.*;
import java.awt.*;

class AppletPanel extends JPanel {
    public void paint (Graphics g) {
        g.drawOval(10,10,40,15);
        g.drawOval(90,10,40,15);
        g.drawLine(70,20,70,50);
        g.drawArc(40,50,50,20,180,180);
    }
}

public class Applet extends JFrame {
    Applet(){
        setSize(500,300);
        AppletPanel ap = new AppletPanel();
        add (ap);
    }
    public static void main(String[] args) {
        new Applet().setVisible(true);
    }
}
