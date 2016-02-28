package simpleUserProgram;

import java.awt.*;
import javax.swing.*;

/*
 * Ne kete klas kam msu qysh me perdore init per Applet
 * edhe pse applet nuk perkrahen ma prej Html; thjesht
 * m'ka pelqy me dit qysh funksionon.
 * 
 * Ky program i vogel ka me shfaq nje ekran edhe ka me i 
 * kerku qe me i fut 2 numrA, ku pastaj programi ka me i llogarite
 * vec shume e tynve. 
 * 
 * */

public class Perdoruesi extends JApplet {
	
	/*
	 * init: This method is intended for whatever initialization 
	 * is needed for your applet. It is called after the param 
	 * tags inside the applet tag have been processed.
	 * */
	
	private double shuma;
	
	public void init()
	{
		//do te krijohen dy variabla, te cilat do ta ruaj vleren qe useri i ka dhane!
		/*
		 * JOptionPane, shfaq dritaren dialog.
		 * */
		String n1 = JOptionPane.showInputDialog("Shtyp nr e pare: ");
		String n2 = JOptionPane.showInputDialog("Shtyp ne e dyte: ");
		
		//variablat mesiper do te kthehen ne double, sepse nr mund te jene edhe me presje dhjetore!
		
		double d1 = Double.parseDouble(n1);
		double d2 = Double.parseDouble(n2);
		
		shuma = d1 + d2;
	}
	
	public void paint(Graphics gr)
	{
		super.paint(gr);
		gr.drawString("Shuma eshte: "+shuma, 25, 25);
		
	}

}
