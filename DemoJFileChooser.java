package test;

import javax.swing.*;

import core.CreatSiteMap;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.*;

public class DemoJFileChooser extends JPanel implements ActionListener {

	JButton go;
	String file;
	JFileChooser chooser;
	String choosertitle;
   
	public DemoJFileChooser() {
		go = new JButton("search");
		go.addActionListener(this);
		add(go);
		this.file = "";
	}

	public void actionPerformed(ActionEvent e) {
        
		chooser = new JFileChooser(); 
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(choosertitle);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//
		// disable the "All files" option.
		//
		chooser.setAcceptAllFileFilterUsed(false);
		//    
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
			System.out.println("getCurrentDirectory(): " +  chooser.getCurrentDirectory());
			System.out.println("getSelectedFile() : " +  chooser.getSelectedFile());
			
			CreatSiteMap s = new CreatSiteMap();
			try {
				s.creatArray(file, chooser.getSelectedFile());
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			s.createSiteMap("SiteMap");
		}
		else {
			System.out.println("No Selection ");
		}
	}
   
	public Dimension getPreferredSize(){
		return new Dimension(200, 200);
	}
    
}
