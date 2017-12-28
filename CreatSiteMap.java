package core;

/**
 * @author Virginie/Stéphane
 * @version 1.0
 */
import data.SiteMapComponents;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CreatSiteMap {
	
	ArrayList<SiteMapComponents> stock;
	
	public CreatSiteMap(){
		stock = new ArrayList<SiteMapComponents>();
	}
	/**
	 * 
	 * @param fileName
	 * @param file
	 * @throws MalformedURLException
	 */
	public void creatArray(String fileName, File file) throws MalformedURLException{
		if (file.isFile() && file.getName().endsWith(".html") && file.canRead()) {
			SiteMapComponents c = new SiteMapComponents();
			c.setDate(new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format((file.lastModified())));
			c.setUrl(file.getName());
			stock.add(c);
			System.out.println(stock.size());
		}
		else if (file.isDirectory()) {
			File[] contenu	= file.listFiles();
			for(int i=0; i < contenu.length; i++) {
				creatArray(fileName + "/" + contenu[i].getName(), contenu[i]);
			}
		}
	}
	/**
	 * 
	 * @param name
	 */
	public void createSiteMap(String name){
		try{
			BufferedWriter bw =new BufferedWriter(new FileWriter(name+".xml")); 
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			bw.newLine();
			bw.write("<urlset xmlns=\"????\">");//Truc Ã  rajouter
			bw.newLine();
			for (int index = 0; index < stock.size(); index++){
				bw.write("\t<url>\n\t\t<loc>" + stock.get(index).getUrl() + "<\\loc>\n"
						+ "\t\t<lastmod>" + stock.get(index).getDate() + "<\\lastmod>\n"
						+ "\t\t<changefreq>" + stock.get(index).getFreqChg() + "<\\changefreq>\n"
						+ "\t\t<priority>" + stock.get(index).getPrio() + "<\\priority>\n"
						+ "\t<\\url>");
				bw.newLine();
			}
			bw.write("<\\urlset>");
			bw.close();
		}catch (FileNotFoundException e){
			System.err.println(e.getMessage());
		}catch (IOException e){
			System.err.println(e.getMessage());
		}
	}
	/**
	 * 
	 * @param name
	 * @throws IOException
	 */
	public void textRead(String name) throws IOException{
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(name));
			for (int index = 0; index < stock.size(); index++) {
				br.toString();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}





