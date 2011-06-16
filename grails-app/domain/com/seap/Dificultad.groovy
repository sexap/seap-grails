package com.seap

class Dificultad {
	
	String nombreDificultad
	
    static constraints = {
		nombreDificultad (blank:false, unique:true)
    }
}
