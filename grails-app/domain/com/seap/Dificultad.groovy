package com.seap

class Dificultad {
	
	String dificultad
	
    static constraints = {
		dificultad blank:false, unique:true
    }
}
