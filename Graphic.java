package package1;

import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;

class MyPanel extends JPanel {
    public void paint(Graphics g) {
        g.drawString("Hello Nandu!!!", 50,30);
        g.drawString("How was the day!?", 80,60);
    }
}
public class Graphic extends JFrame{
    Graphic()
    {
        setSize(150,100);
        MyPanel mp = new MyPanel();
        add(mp);
    }
    public static void main(String[] args) {
        new Graphic().setVisible(true);
        new Graphic().setVisible(true);
    }
}
