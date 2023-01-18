package appendToFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class JavaAppendToFile {

	public static void main(String[] args) throws IOException {

		//Java append to file using FileWriter
		
		File file = new File("append.txt");
		FileWriter fr = new FileWriter(file, true);
		fr.write("data");
		fr.write("data");
		fr.close();
		
		//Java append content to existing file using BufferedWriter
		
		
		File fileA = new File("appendA.txt");
		FileWriter frA = new FileWriter(fileA, true);
		BufferedWriter br = new BufferedWriter(frA);
		br.write("data");

		br.close();
		fr.close();
		
		//Append text to file in java using PrintWriter
		
		
		File fileAA = new File("appendAA.txt");
		FileWriter frAA = new FileWriter(fileAA, true);
		BufferedWriter brA = new BufferedWriter(frAA);
		PrintWriter pr = new PrintWriter(brA);
		pr.println("data");
		pr.close();
		brA.close();
		frAA.close();
		
		//Append to file in java using FileOutputStream
		
		OutputStream os = new FileOutputStream(new File("appendAAA.txt"), true);
		os.write("data".getBytes(), 0, "data".length());
		os.close();
		
		
		
		
		
		
		
		
		

	}
	
	

}
