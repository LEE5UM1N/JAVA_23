package com.java.statement;

public class Gugudan {

	public static void main(String[] args) {
		
		int dan=2;
		int gop=1;
		String output="";
		
		for(;dan<10;dan++) {
			output = output+dan+"´Ü\n";
			for(gop=1;gop<10;gop++) {
				output = output + dan + " * " + gop + " = "+(dan*gop)+"\n";
			}
			output = output+"\n";
		}
		
		System.out.println(output);
	}

}
