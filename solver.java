package Anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	public class solver {

		private static final String fileName = "C:/Users/ewomack/workspace/Hello/src/Anagram/input.txt";

		public static void main(String[] args) {

		 	BufferedReader br = null;
		 	FileReader fr = null;

		 	try {

		 		//br = new BufferedReader(new FileReader(FILENAME));
		 		fr = new FileReader(fileName);
		 		br = new BufferedReader(fr);

		 		String sCurrentLine;

		 		while ((sCurrentLine = br.readLine()) != null) {
		 				System.out.println(sCurrentLine);
		 		}

		 	} catch (IOException e) {

		 		e.printStackTrace();

		 	} finally {

		 		try {

		 			if (br != null)
		 				br.close();

		 			if (fr != null)
		 					fr.close();

		 		} catch (IOException ex) {

		 			ex.printStackTrace();

		 		}

		 	}

		}

	}