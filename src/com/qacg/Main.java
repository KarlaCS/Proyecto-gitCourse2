package com.qacg;

import com.qacg.utils.StringUtils;
import com.qacg.utils.StringUtilsSeg;

public class Main {
	public static void main(String args[]){
		String s = "HOLA";
		System.out.println("Min�sculas: "+StringUtils.toLowerCase(s));
		String s2 = "hola";
		System.out.println("May�sculas: "+StringUtilsSeg.toUpperCase(s2));
	}

}
