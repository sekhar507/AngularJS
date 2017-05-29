package org.iowa;

import java.util.Scanner;

public class FunctionCalling {
	public static void main(String[] args) {
		Scanner toread = new Scanner(System.in);
		System.out.println("Please Enter Length::");
		int l=toread.nextInt();
		System.out.println("Please Enter width::");
		int w=toread.nextInt();
		int area=areaRectangle(l,w);
		System.out.println(area);
		int per=perimeterRectangle(l,w);
		System.out.println(per);

	}

	public static int areaRectangle(int length, int width) {
		return length * width;
	}

	public static int perimeterRectangle(int length, int width) {
		return 2 * (length + width);
	}
}
