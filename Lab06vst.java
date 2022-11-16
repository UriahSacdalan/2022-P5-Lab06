    // Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);


        // Draw Random Lines
        Random rand = new Random();
        for (int line = 1; line <= 100; line++) {
            int x1 = rand.nextInt(390) + 10;
            int y1 = rand.nextInt(290) + 10;
            int x2 = rand.nextInt(390) + 10;
            int y2 = rand.nextInt(290) + 10;
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
            g.setColor((new Color(red,green,blue)));
            g.drawLine(x1, y1, x2, y2);

        }


        // Draw Random Squares
        for (int square = 1; square <= 100; square++)
        {
            int x = rand.nextInt(340) + 400;
            int y = rand.nextInt(235) + 10;
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
            g.setColor((new Color(red,green,blue)));
            g.fillRect(x,y,50,50);
        }

        // Draw Random Circles
        for (int circle = 1; circle <= 100; circle++)
        {
            int diameter = rand.nextInt(200);
            int x = rand.nextInt(391 - diameter) + 10;
            int y = rand.nextInt(291 - diameter) + 300;
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
            g.setColor((new Color(red,green,blue)));
            g.drawOval(x, y, diameter, diameter);
        }

        // Draw 3-D Box

        //Yellow
        g.setColor(Color.yellow);
        Polygon yellow = new Polygon();
        yellow.addPoint(500,350);
        yellow.addPoint(600,350);
        yellow.addPoint(600,450);
        yellow.addPoint(500,450);
        g.fillPolygon(yellow);

        //Green
        g.setColor(Color.green);
        Polygon green = new Polygon();
        green.addPoint(500,350);
        green.addPoint(540,400);
        green.addPoint(540,500);
        green.addPoint(500,450);
        g.fillPolygon(green);

        //Blue
        g.setColor(Color.blue);
        Polygon blue = new Polygon();
        blue.addPoint(600,350);
        blue.addPoint(640,400);
        blue.addPoint(640,500);
        blue.addPoint(600,450);
        g.fillPolygon(blue);

        //Red
        g.setColor(Color.red);
        Polygon red = new Polygon();
        red.addPoint(540,400);
        red.addPoint(640,400);
        red.addPoint(640,500);
        red.addPoint(540,500);
        g.fillPolygon(red);

    }
}






    
 