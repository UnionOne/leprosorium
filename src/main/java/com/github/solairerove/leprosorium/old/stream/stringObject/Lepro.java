package com.github.solairerove.leprosorium.old.stream.stringObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lepro {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = new String[100];

		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to exit.");

		for (int i = 0; i < 100; i++) {

			str[i] = br.readLine();

			if (str[i].equals("stop")) {
				break;
			}
		}

		System.out.println("Here is your text: ");

		for (int i = 0; i < 100; i++) {

			if (str[i].equals("stop")) {
				break;
			}

			System.out.println(str[i]);
		}
	}
}