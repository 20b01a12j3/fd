import javax.swing.*;
import java.Applet.*;
import java.awt.*;
public class ParamDemoextends JApplet
{
    public void paint(Graphics g)
    {
        String str1 = getParameter("n1");
        String str2 = getParameter("n2");
        int a,b,c;
        a = Integer .ParseInt(str1);
        b = Integer.ParseInt(str2);
        c = a+b;
        String output = "addition of "+a+"and"+b+"is"+c;
        g.drawString(output ,50,50);
    }
}
/*<appletcode = "ParamCode" width = 100 height = 100>
    <param name = "n1" value = 50> </param>
    <param name = "n2" value = 30></param>
</appletcode>*/