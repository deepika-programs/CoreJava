package com.deepika.checked.exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionDemo {

	public static void main(String[] args) {
		/*
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			
			try {
				String input = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		*/
		readFile();
	}

	public static void readFile() {
		FileReader fr = null;
		try {
			fr = new FileReader("e:/Deepika/myfile.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			if(line==null) {
				throw new IOException("File has no content");
			}
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File does not exists.....");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(null!=fr) {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
