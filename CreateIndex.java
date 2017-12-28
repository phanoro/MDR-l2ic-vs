package core;

import data.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CreateIndex {
	
	private ArrayList<HtmlSiteMapComponents> index;
	
	public CreateIndex() {
		this.index = new ArrayList<HtmlSiteMapComponents>() ;
	}
	
	public void createArray(String fileName, File file){
		if (file.isFile() && file.getName().endsWith(".html") && file.canRead()) {
			HtmlSiteMapComponents c = new HtmlSiteMapComponents();
			c.setUrl(file.getName());
			try {
				c.getTitleMarker(file, index.size());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				c.getH1Marker(file, index.size());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index.add(c);
			System.out.println(index.size());
		}
		else if (file.isDirectory()) {
			File[] contenu	= file.listFiles();
			for(int i=0; i < contenu.length; i++) {
				createArray(fileName + "/" + contenu[i].getName(), contenu[i]);
			}
		}
	}
	
	public void createIndex(){
		try{
			BufferedWriter WriterIndex =new BufferedWriter(new FileWriter("Index.csv")); 
			WriterIndex.write("INDEX :");
			WriterIndex.newLine();
			for (int i = 1; i<index.size()-1; i++){
				WriterIndex.write("\t\t"+ index.get(i).getUrl() + "\t\t;"+ index.get(i).getTitle() + "\t\t;"+ index.get(i).getH1());
				WriterIndex.newLine();
			}
			WriterIndex.close();
		}catch (FileNotFoundException e){
			System.err.println(e.getMessage());
		}catch (IOException e){
			System.err.println(e.getMessage());
		}
	}
}
