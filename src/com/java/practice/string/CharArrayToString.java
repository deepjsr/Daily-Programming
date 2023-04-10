package com.java.practice.string;

/**
 * @author DEEP J SARMA
 *	WAP TO CONVERT CHAR ARRAY INTO STRING WITHOUT USING BUILT IN
 *
 */
public class CharArrayToString {
	public static void main(String[] args) {
		char[]	charr={'j','a','v','a'};
		String sarr="";
		for(char chary:charr) {
			sarr+=chary;
		}
		System.out.println(sarr);
	}
}
