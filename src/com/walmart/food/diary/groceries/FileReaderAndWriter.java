package com.walmart.food.diary.groceries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderAndWriter {

	public static void main(String[] args) {
		

		File f1 = new File("/Users/kavithareddy/Downloads/test1.rtf");// path

		System.out.println(f1.getAbsoluteFile());

		FileInputStream fis;
		try {
			fis = new FileInputStream(f1);

			InputStreamReader isreader = new InputStreamReader(fis, "ISO-8859-1");
			int t;
			StringBuilder fileContent = new StringBuilder();

			while ((t = isreader.read()) != -1) {
				char temp = (char) t; // type casting (target data type)object/variable name --> 1233.34 --> int 1233

				fileContent.append(temp);

			}
			System.out.println(fileContent);
			
			isreader.close(); // child close operation first 
			fis.close();// then parent next 

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}

	}

}
