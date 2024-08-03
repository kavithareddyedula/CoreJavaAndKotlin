package com.walmart.food.diary.groceries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderAndWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 = new File("/Users/kavithareddy/Downloads/test1.rtf");

		System.out.println(f1.getAbsoluteFile());

		FileInputStream fis;
		try {
			fis = new FileInputStream(f1);

			InputStreamReader isreader = new InputStreamReader(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}

	}

}
