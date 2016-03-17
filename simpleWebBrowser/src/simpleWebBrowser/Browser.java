package simpleWebBrowser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Browser extends JFrame{
	
	//address bar at a top. would be responsible for the URL!
	private JTextField addressBar;
	//the main display window, would display the URL's results!
	private JEditorPane display;
	
	//constructor
	public Browser(){
		//give the app. a title. 
		super("GramoBrowser");
		
		addressBar = new JTextField("enter a URL!");
		//when the user press the enter tab, the ac. listener would 
		//be proceed the process. 
		addressBar.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent event) {
					/**
					 * 
					the method would be able to get the URL from the addressBar; 
					Whatever URL would be typed, the event.getActionCommand() would
					treat like a string and after would pass it to the loadURL!
					loadURL would read HTML files and displaying on the screen
					*/
					loadURL(event.getActionCommand());
					
				}
			}
		);
		
		//would display place, NORTH, on top of the screen!
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		//now to change the title of that "file", u just can view it!
		display.setEditable(false);
		//it's going to see on every link that gets displayed
		//would take the link and it's going to pass to the loadURL method
		display.addHyperlinkListener(
			new HyperlinkListener(){
				public void hyperlinkUpdate(HyperlinkEvent event){
					if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
						loadURL(event.getURL().toString());
					}
				}
			}
		);
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(550, 310);
		setVisible(true);
	}
	
	//loadURL to display on the screen!!
	
	private void loadURL(String userText){
		try{
			display.setPage(userText);
			//the address what we're visiting won't be deleted! 
			addressBar.setText(userText);
		}catch(Exception e){
			System.out.println("WOW!!!!!");
			
		}	
	}
}
