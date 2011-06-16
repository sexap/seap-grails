package com.seap

class Uea {
	String nombreUea
	String departamento
    
	static constraints = {
		nombreUea (blank:false, unique:true)
		departamento (blank:false)
    }
}
