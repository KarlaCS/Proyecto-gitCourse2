package com.qacg;

import com.qacg.utils.EmailUtils;
import com.qacg.utils.StringUtils;
import com.qacg.utils.StringUtilsSeg;

public class Main {
	public static void main(String args[]){
		String s = "Hola";
		System.out.println("Minúsculas: "+StringUtils.toLowerCase(s));
		System.out.println("Mayúsculas: "+StringUtilsSeg.toUpperCase(s));
		EmailUtils.enviarCorreo("karla.cruz@qacg.com");
	}

}
