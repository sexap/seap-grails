package com.seap

class Actividad {
	
	String nombreActividad
	String descripcion
	String tema
	String unidad
	Date fechaInicio
	Date fechaFin
	Dificultad dificultad
	TipoActividad tipoActividad
	
	static hasMany = [problemas:Problema]
	
	
    static constraints = {
		nombreActividad blank:false
		descripcion blank:false
		tema blank:false
		unidad blank:false
		fechaInicio
		fechaFin
		dificultad
		tipoActividad
    }
}
