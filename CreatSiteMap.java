package core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Vector;

import data.*;

public class CreatSiteMap {
	
	private File file;
	private static ArrayList<File> stock = new ArrayList<File>();
	
	public CreatSiteMap() {
		this.setFile(new File("SiteMap"));
		textSave();
		
		
	}
	
	private void creatArray(String place) throws FileNotFoundException{
		
		BufferedReader br = new BufferedReader( new FileReader (place + "promenade_fr.d"));
		
		
	}
	
	private void textSave() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("SiteMap"));
			for (int index = 0; index < fileCount(); index++) {
				if (stock.get(index).getName().contains(".html") || stock.get(index).getName().contains(".HTML")){
					bw.write(stock.get(index).toString());
					bw.newLine();
				}
			}
			bw.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public boolean searchFile(String fileToFind, File searchIn) {
		File[] listOfFiles = searchIn.listFiles();
		Vector<File> listOfDirectories = new Vector<File>();
		Vector<File> listOfSimpleFiles = new Vector<File>();
		for (File file : listOfFiles) {
			if (file.isDirectory())
				listOfDirectories.add(file);
			else
				listOfSimpleFiles.add(file);		
		}
		boolean find = false;
		while (!find) {
			int i = 0;
			while (i < listOfSimpleFiles.size() && !find) {
				if (listOfSimpleFiles.get(i).getName()
						.equalsIgnoreCase(fileToFind)) {
					return true;
				} else
					i++;
			}
			int j = 0;
			while ((j < listOfDirectories.size()) && !find) {
				if(listOfDirectories.get(j).getName().equalsIgnoreCase(fileToFind))
					return true;
				else if(searchFile(fileToFind, listOfDirectories.get(j)))
					return true;
				else
					j++;
			}
			return false;
		}		
		return false;
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
