package Anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class main {
	String file = "C:/Users/Administrator/Downloads/test.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void anagramSolver() {
		Scanner input = new Scanner(System.in);
	}
/*	public void solver() throws FileNotFoundException {
		String content  = new Scanner(new File("test")).useDelimiter(" ").next();
		System.out.println(content);
	}*/

	private String readFile(String file) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    try {
	        while((line = reader.readLine()) != null) {
	            stringBuilder.append(line);
	            stringBuilder.append(ls);
	        }

	        return stringBuilder.toString();
	    } finally {
	        reader.close();
	    }
	}


}

