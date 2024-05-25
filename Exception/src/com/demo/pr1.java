package com.demo;

public class pr1 {

	public static void main(String[] args) {
		
		System.out.println("----------Start-----------");
		String a="India" ;
		try {
			System.out.println(a.charAt(10));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("----------End-----------");
	}

}
