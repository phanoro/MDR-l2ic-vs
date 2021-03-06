package test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
/**
 * 
 * @author Virginie/Stéphane
 * @version 1.0
 */
public class ListingTest {
	public static void main(String[]args){
		init("SiteMap");
	}
	/**
	 * 
	 * @param name
	 */
	public static void init(String name){
		
		JFrame frame = new JFrame("");
		DemoJFileChooser panel = new DemoJFileChooser();
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
