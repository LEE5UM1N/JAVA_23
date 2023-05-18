package com.java.variable;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		int kor, eng, math, scien;
		int total;
		float avg;
		char grade=' ';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.");
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		math = scan.nextInt();
		System.out.print("과학 : ");
		scien = scan.nextInt();
		
		total = (kor+eng+math+scien)*10;
		avg = (total/4)/10f;
		total = total/10;
		
		if(avg <= 100 && avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
		
		System.out.println("국어\t영어\t수학\t과학");
		System.out.printf("%d\t%d\t%d\t%d\n",kor,eng,math,scien);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+grade);
		
	}

}
