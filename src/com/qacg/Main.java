package com.qacg;

import com.qacg.utils.EmailUtils;
import com.qacg.utils.StringUtils;
import com.qacg.utils.StringUtilsSeg;

public class Main {
	public static void main(String args[]){
		String s = "Hola";
		System.out.println("Min�sculas: "+StringUtils.toLowerCase(s));
		System.out.println("May�sculas: "+StringUtilsSeg.toUpperCase(s));
		EmailUtils.enviarCorreo("karla.cruz@qacg.com");
	}

}
