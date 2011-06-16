package com.seap

import java.util.Date

class Comentario {
	
	String cuerpoComentario
	Date dateCreated
	Date dateUpdated
	
	static belongsTo = [usuario:User,problema:Problema]
	
    static constraints = {
		cuerpoComentario (blank:false)
    }
}
