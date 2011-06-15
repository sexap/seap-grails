package com.seap

class User {

	//a–adidos por default
	
	String username
	String password
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	
	//para satisfacer la logica de negocios
	
	String nombre
	String apellidoPaterno
	String apellidoMaterno
	String telefono
	String email
	String facebook
	String twitter
	String mensaje
	//imagen
	String matricula
	String carrera
	
	List problemasPendientes
	static hasMany = [problemasPendientes:Problema]
	
	Date dateCreated
	Date lastUpdated
	
	static constraints = {
		username blank: false, unique: true
		password blank: false
		nombre blank:false 
		apellidoPaterno blank:false
		apellidoMaterno blank:false
		telefono blank:false
		email blank:false, email: true, unique: true
		facebook
		twitter
		mensaje
		matricula blank:false,unique
		carrera blank:false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role } as Set
	}
}
