package p18.textbook.exercises.ex07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/p18/textbook/exercises/ex07/AddLineNumberExample.java";
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		int cnt = 1;
		String line =  null;
		
		while((line = br.readLine()) !=null) {
			System.out.println(cnt++ + ": " + line);
			
		}
		reader.close();
		br.close();
		}
}
