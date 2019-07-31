package day005;

import java.util.Scanner;

public class fenzhijiegou {

	public static void main(String[] args){
		
		//比较两个数大小
//		System.out.println("输入两个整数:");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(a >= b){
//			System.out.println(a + "比较大");
//		}
//		else{
//			System.out.println(b + "比较大");
//		}
		
		/*2.判断用户输入的是负数还是非负数（至少使用两种方式去实现）*/
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num >=0){
//			System.out.println(num + " 是非负数");
//		}
//		else{
//			System.out.println(num + " 是负数");
//		}
		
		
		/*3.根据用户的成绩判断该成绩所在的等级，并打印出来

        [90-100] A
        [80-89]  B
        [70-79]  C
        [60-69]  D
        [0-59]   E
*/
//		System.out.println("请输入成绩（0-100）");
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
		
/*		4.根据用户输入的秒数拆分为时分秒并打印出来*/
		
//		System.out.println("请输入一个整数秒数");
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
//		System.out.println(hours + " 时 " + minute + " 分  " + a + "秒");
		/*
		5.提示用户输入三位数正数，然后进行逆序处理再打印。*/
		
		System.out.println("请输入一个三位数整数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(a % 10);
		a = a / 10;
		System.out.print(a % 10);
		a /= 10;
		System.out.print(a);
		
		
	}
}
