package br.com.alura.io.java.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("lorem2.txt");
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
		ps.println();
		ps.println();
		ps.println();
		ps.print("Nullam volutpat iaculis semper. Sed molestie pharetra interdum.");
		
		ps.close();

	}

}
