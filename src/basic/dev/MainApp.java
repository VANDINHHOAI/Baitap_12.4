package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, reversed = 0;
		System.out.println("Nhap n: ");
		num1 = sc.nextInt();
		num2 = num1;
		for (; num1 != 0; num1 /= 10) {
			int digit = num1 % 10;
			reversed = reversed * 10 + digit;
		}
		System.out.println("So " + num2 + " " + "sau khi dao nguoc la: " + reversed);
		
		System.out.println("---------------------------------");
		if (reversed == num2) {
			System.out.println(reversed + " :la mot so polinom!");
		}else {
			System.out.println(reversed + " :khong phai la mot so polinom!");
		}
	}
}
