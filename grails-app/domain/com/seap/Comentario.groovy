package com.seap

class Comentario {
	
	String cuerpoComentario
	
	static belongsTo = [usuario:User,problema:Problema]
	
    static constraints = {
		cuerpoComentario blank:false
    }
}
