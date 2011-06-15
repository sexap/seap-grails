package com.seap

class Uea {
	String uea
	String departamento
    
	static constraints = {
		uea blank:false, unique:true
		departamento blank:false
    }
}
