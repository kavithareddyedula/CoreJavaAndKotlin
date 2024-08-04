package com.walmart.food.diary.groceries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteByByteIOOperations {

	public static void main(String[] args) throws IOException {
		File f1 = new File("/Users/kavithareddy/Downloads/test1.rtf");// path

		System.out.println(f1.getAbsoluteFile());

		FileInputStream fis = null;
		FileOutputStream fos = null;

		fis = new FileInputStream(f1);
		fos = new FileOutputStream(new File("/Users/kavithareddy/Downloads/testoutput.rtf"));
		try {
			int t;

			while ((t = fis.read()) != -1) {

				fos.write(t);

			}
			//System.exit(0);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		} finally { // optional .. it is recommended clean up .. nothing but closing the streams or
					// nullifying the the objects
			//  finally block always get executed ,exception Sysatem.exit(0)
			System.out.println("i am from finally block ");
			fos.close();
			fis.close();// then parent next

		}

		/*
		 * try (FileReader fr = new FileReader(path); BufferedReader br = new
		 * BufferedReader(fr)) { return br.readLine(); } java.lang.AutoCloseable, which
		 * includes all objects which implement java.io.Closeable, can be used as a
		 * resource.
		 */
	}

}
