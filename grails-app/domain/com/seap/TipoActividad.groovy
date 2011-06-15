package com.seap

class TipoActividad {
	
	String tipoActividad
	
    static constraints = {
		tipoActividad blank:false,unique:true
    }
}
