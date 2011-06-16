package com.seap

class Grupo {
	
	String nombreGrupo
	Uea uea
	//String horario
	//String trimestre
	//String profesoresresponsables
	Date dateCreated
	Date lastUpdated
	
	static hasMany = [alumnos:User,profesores:User,actividades:Actividad] 

    static constraints = {
		nombreGrupo (blank:false)
    }
}
