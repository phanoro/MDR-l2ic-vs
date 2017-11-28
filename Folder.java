package data;

import java.util.ArrayList;

public class Folder {
	private String name;
	private ArrayList<File> folder1;
	private ArrayList<Folder> folder2;
	
	public Folder(String name){
		this.name = name;
		folder1 = new ArrayList<File>();
		folder2 = new ArrayList<Folder>();
	}
	
	public void listAllFile(){
		for(int i = 0; i < folder1.size(); i++){
			System.out.println(folder1.get(i));
		}
	}
	
	public void listAllFolder(){
		for(int i = 0; i < folder2.size(); i++){
			System.out.println(folder2.get(i));
		}
	}
	
	public File browseFile(){
		for (int index = 0; index < folder1.size(); index++){
			return folder1.get(index);
		}
		return null;
	}
	
	public Folder browseFolder(){
		for (int index = 0; index < folder2.size(); index++){
			return folder2.get(index);
		}
		return null;
	}
	
	
	
}
