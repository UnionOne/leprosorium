package com.github.solairerove.leprosorium.old.file.modifiedCopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;

		try (FileInputStream fin = new FileInputStream(".//src/com.github.solairerove.leprosorium.old.file/modifiedCopyFile/input.txt");

				FileOutputStream fout = new FileOutputStream(".//src/com.github.solairerove.leprosorium.old.file/modifiedCopyFile/output.txt")) {

			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("I/O error: " + e);
		}
	}
}