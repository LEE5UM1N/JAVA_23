package com.java.variable;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		int kor, eng, math, scien;
		int total;
		float avg;
		char grade=' ';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.print("���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		math = scan.nextInt();
		System.out.print("���� : ");
		scien = scan.nextInt();
		
		total = (kor+eng+math+scien)*10;
		avg = (total/4)/10f;
		total = total/10;
		
		if(avg <= 100 && avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
		
		System.out.println("����\t����\t����\t����");
		System.out.printf("%d\t%d\t%d\t%d\n",kor,eng,math,scien);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
		System.out.println("���� : "+grade);
		
	}

}
