package com.java.statement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu=0;
		
		while(menu!=5) {
					System.out.println("===============================================================================");
					System.out.println("1.ȸ����ȸ\t2.ȸ�����\t3.ȸ������\t4.ȸ������\t5.����");
					System.out.println("===============================================================================");
					System.out.print("�޴��� �Է��ϼ���.");
					
					menu=scan.nextInt();
		
					switch(menu) {
					case 1:
						System.out.println("ȸ����ȸ�� �����մϴ�.");
						break;
					case 2:
							System.out.println("ȸ������� �����մϴ�.");
							break;
					case 3:
							System.out.println("ȸ�������� �����մϴ�.");
								break;
					case 4:
							System.out.println("ȸ�������� �����մϴ�.");
								break;
					case 5:
							System.out.println("���α׷��� �����մϴ�.");
							break;
					default:
							System.out.println("�޴������� �ùٸ����ʽ��ϴ�.");
					}
		}
	}
}
