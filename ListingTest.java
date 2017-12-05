package test;

import java.io.RandomAccessFile;

import data.*;

public class ListingTest {
	public static void main(String[]args){
		try{
			RandomAccessFile file = new RandomAccessFile("promenade_fr.d", "r");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
