package showFileInPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// /home/abigor/workspace/leprosorium/src/showFileInPractice/text

class Lepro {

	public static void main(String[] args) {
		
		int i;
		FileInputStream fin = null;	
		
		/*
		 * В следующем коде открывается файл, из которого читаются
		 * символы до тех пор, пока не встретися знак EOF, а затем
		 * файл закрывается в блоке finally.
		 */
		try {
			fin = new FileInputStream("/home/abigor/workspace/leprosorium/src/showFileInPractice/text");
			
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		} catch(FileNotFoundException e) {
			System.out.println("File not found.");
		} catch(IOException e) {
			System.out.println("An I/O error occurred.");
		} finally {
			try {
				if(fin != null) fin.close();
			} catch(IOException e) {
				System.out.println("Error closing file.");
			}
		}
	}
}