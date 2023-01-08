package package1;

import org.jetbrains.annotations.NotNull;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

class ColorPanel extends JPanel
{
    public void paint (Graphics g)
    {
        Color red = new Color(255,0,0);
        Color green = new Color(0,255,0);
        Color blue = new Color(255,0,0);
        Color yellow = new Color(255,0,0);
        g.setColor(red);
        g.drawLine(10,10,40,40);
        g.setColor(green);
        g.drawRect(10,60,20,20);
        g.setColor(Color.blue);
        g.drawOval(80,10,40,40);
        g.setColor(Color.yellow);
        g.fillArc(80,80,40,40,90,270);
    }
}
public class GraphicColors extends JFrame {
    GraphicColors()
    {
        setSize(500,300);
        ColorPanel cp = new ColorPanel();
        add(cp);
    }
    public static void main(String[] args) {
        new GraphicColors().setVisible(true);
    }
}
