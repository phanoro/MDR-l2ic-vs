package data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Folder {
	private String name;
	private ArrayList<File> folder;
	
	public Folder(String name){
		this.name = name;
		folder = new ArrayList<File>();
	}
	
	public void listAllFile(){
		for(int i = 0; i < folder.size(); i++){
			System.out.println(folder.get(i));
		}
	}
	
	public File browseFile(){
		for (int index = 0; index < folder.size(); index++){
			return folder.get(index);
		}
		return null;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int fileCount() {
		return folder.size();
	}	
}
