package com.qacg;

import com.qacg.utils.StringUtils;
import com.qacg.utils.StringUtilsSeg;

public class Main {
	public static void main(String args[]){
		String s = "HOLA";
		System.out.println("Minúsculas: "+StringUtils.toLowerCase(s));
		String s2 = "hola";
		System.out.println("Mayúsculas: "+StringUtilsSeg.toUpperCase(s2));
	}

}
