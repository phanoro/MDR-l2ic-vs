package core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import data.*;

public class CreatSiteMap {
	
	private File file;
	private ArrayList<String> stock = new ArrayList<String>();
	
	public CreatSiteMap() {
		this.setFile(new File("SiteMap"));
		textSave();
		
		
	}
	
	private void creatArray(){
		
		
	}
	
	private void textSave() {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("SiteMap"));
			for (int index = 0; index < fileCount(); index++) {
				if (stock.get(index).contains(".html") || stock.get(index).contains(".HTML")){
					br.write(stock.get(index).toString());
					br.newLine();
				}
			}
			br.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public int fileCount() {
		return stock.size();
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
}
