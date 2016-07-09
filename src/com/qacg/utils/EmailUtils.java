package com.qacg.utils;

public class EmailUtils {
	public static boolean enviarCorreo(String email){
		if(email != null){
			System.out.println("Correo enviado exitosamente a "+email);
			return true;
		}else{
			return false;
		}
	}
}
