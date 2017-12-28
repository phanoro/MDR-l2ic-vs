package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JFrame;
/**
 * 
 * @author Virginie/Stéphane
 * @version 1.0
 *
 */
public class SiteMapCreatorLauncher {										
	public static void main(String[]args){
		init("SiteMap");
	}
	
	Scanner sc = new Scanner(System.in);
    System.out.println(" Please type your keyword:");
    int str = sc.nextInt();
    System.out.println("You choose the following keyword : " + str);
    /**
     * 
     * @param name
     */
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
