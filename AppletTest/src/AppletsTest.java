import java.awt.*;
import javax.swing.*;

public class AppletsTest extends JApplet {
	

	/*
    An applet is a Java program that runs in a Web browser
    My first test on Applets. This first test, it's going to produce a
    pop - up window! 
    ***************
	 I'm going to pain something on screen; and to do it, I have to invoke the
    paint method of the Applet [one of the fourth methods of the Applet class!]
    ***************
    Graphics extends from java.awt.*; 
   Contains all of the classes for creating user interfaces 
   and for painting graphics and images.
   
   Here isn't any main method because an Applet would run
   on browser; the browser would take care all the stuff :)!
   */
	
	
	public void paint(Graphics gr)
	{
		super.paint(gr);
		gr.drawString("Hej je tu vizatu!", 30, 30);
		
	}

}