import java.applet.Applet;
import java.awt.Graphics;

public class applet1 extends Applet {
    @Override
    public void init() {
        System.out.println("applet initialize");

    }

    @Override
    public void start() {
        System.out.println("applet starting");

    }

    @Override
    public void stop() {
        System.out.println("applet stopping");

    }

    @Override
    public void destroy() {
        System.out.println("applet destroying");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("hellow hunter", 50, 50);

    }

}

// html file which embbed the above applet

<html><head><title>appletexample</title></head><body><applet code ="applet1.class"width="400"height="400"></applet></body></html
>
