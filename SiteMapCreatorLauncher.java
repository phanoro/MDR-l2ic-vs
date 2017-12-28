package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class SiteMapCreatorLauncher {										//The programme's launching class
	public static void main(String[]args){
		init("SiteMap");
	}
	
	public static void init(String name){
		
		JFrame frame = new JFrame(name);
		GuiSiteMap panel = new GuiSiteMap();
		frame.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			}
		);
	    frame.getContentPane().add(panel,"Center");
	    frame.setSize(panel.getPreferredSize());
	    frame.setVisible(true);
	
	}
}