package com.seap

class Problema {
	
	String tituloProblema
	String enunciadoProblema
	
	List ueas
	static hasMany = [ueas:Uea,comentarios:Comentario] 
	
	Dificultad dificultad
	
	String palabrasClave
	String observaciones
	User autor
	boolean privado = false
	Date dateCreated
	Date lastUpdated
	//tiempo
	//memoria

    static constraints = {
		tituloProblema blank:false,unique:true
		enunciadoProblema blank:false
		ueas
		dificultad
		palabrasClave blank:false
		observaciones blank:false
		autor display:false
		privado
    }
}
