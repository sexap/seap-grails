package com.seap

class LenguajeProgramacion {
	
	String nombreLenguajeProgramacion
	
    static constraints = {
		nombreLenguajeProgramacion blank:false, unique:true
    }
}
