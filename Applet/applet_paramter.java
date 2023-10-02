import java.applet.Applet;
import java.awt.Graphics;

public class applet_paramter extends Applet {

    private String name;

    @Override
    public void init() {
        name = getParameter("name");
    }

    public void paint(Graphics g) {
        g.drawString("hellow " + name, 50, 50);
    }
}

//hmtl file 
<html>
<head>
<title>  example </title>
</head>
<body>
<applet code = "applet_paramter" width = "400" height = "400">
<param name = "name" value="utsav">
</applet>
</body>
</html>