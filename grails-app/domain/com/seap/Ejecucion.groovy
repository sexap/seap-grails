package com.seap

class Ejecucion {
	
	String codigoFuente
	Date dateCreated
	//tiempo
	//memoriautiliazada
	LenguajeProgramacion lenguaje
	String veredicto
	
	static belongsTo = [usuario:User,problema:Problema]

    static constraints = {
		codigoFuente blank:false
		lenguaje
		veredicto blank:false
    }
}
