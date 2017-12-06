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
	
	File f ;
	File d = new File("C:");
	private static ArrayList<File> stock = new ArrayList<File>();
	
	public CreatSiteMap(File file, String name){
		
		this.f = new File(name+=".xml");
		try {
			creatArray(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		textSave(name);
		
		
	}
	
	private void creatArray(File f) throws FileNotFoundException{
		
		BufferedReader br = new BufferedReader( new FileReader (f));
		if (searchFile(f.getName(), d)){
			for(int i = 0; i < d.length(); i++){
				if(f.isFile() && (f.getName().endsWith(".html") || f.getName().endsWith(".HTML"))){
					stock.add(f);
				}
			}
		}
	}
	
	private void textSave(String name) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(name));
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
				if (listOfSimpleFiles.get(i).getName().equalsIgnoreCase(fileToFind)) {
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
	
}
