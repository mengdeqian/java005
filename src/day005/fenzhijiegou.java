package day005;

import java.util.Scanner;

public class fenzhijiegou {

	public static void main(String[] args){
		
		//�Ƚ���������С
//		System.out.println("������������:");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(a >= b){
//			System.out.println(a + "�Ƚϴ�");
//		}
//		else{
//			System.out.println(b + "�Ƚϴ�");
//		}
		
		/*2.�ж��û�������Ǹ������ǷǸ���������ʹ�����ַ�ʽȥʵ�֣�*/
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num >=0){
//			System.out.println(num + " �ǷǸ���");
//		}
//		else{
//			System.out.println(num + " �Ǹ���");
//		}
		
		
		/*3.�����û��ĳɼ��жϸóɼ����ڵĵȼ�������ӡ����

        [90-100] A
        [80-89]  B
        [70-79]  C
        [60-69]  D
        [0-59]   E
*/
//		System.out.println("������ɼ���0-100��");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if(a <= 59 && a >= 0){
//			System.out.println('E');
//		}
//		else if(a >59 && a <= 69){
//			System.out.println('D');
//		}
//		else if(a > 69 && a <= 79){
//			System.out.println('C');
//		}
//		else if(a > 79 && a <= 89){
//			System.out.println('B');
//		}
//		else if(a > 89 && a <=100){
//			System.out.println('A');
//		}
		
/*		4.�����û�������������Ϊʱ���벢��ӡ����*/
		
//		System.out.println("������һ����������");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int hours = 0;
//		if(a >= 3600){
//			hours = a / 3600;
//		}
//		a = a % 3600;
//		int minute = 0;
//		if(a >= 60){
//			minute = a / 60;
//		}
//		a = a % 60;
//		System.out.println(hours + " ʱ " + minute + " ��  " + a + "��");
		/*
		5.��ʾ�û�������λ��������Ȼ������������ٴ�ӡ��*/
		
		System.out.println("������һ����λ������");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(a % 10);
		a = a / 10;
		System.out.print(a % 10);
		a /= 10;
		System.out.print(a);
		
		
	}
}
