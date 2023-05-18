package com.java.statement;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		
		int dan=2;
		int gop=1;
		String output="";
		int maxDan = 9;
		int maxGop = 9;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("´Ü¼ö: ");
		maxDan=scan.nextInt();
		System.out.print("°ö¼ö: ");
		maxGop=scan.nextInt();
		
		for(;dan<maxDan+1;dan++) {
			output = output+dan+"´Ü\n";
			for(gop=1;gop<maxGop+1;gop++) {
				output = output + dan + " * " + gop + " = "+(dan*gop)+"\n";
			}
			output = output+"\n";
		}
		
		System.out.println(output);
	}

}
