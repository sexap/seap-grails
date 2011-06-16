package com.seap

class Usuario extends User{
	
	String nombreUsuario
	String apellidoPaterno
	String apellidoMaterno
	//String telefono
	String mail
	String facebook
	String twitter
	String mensaje
	//imagen
	String matricula
	String carrera
	
	List problemasPendientes
	static hasMany = [problemasPendientes:Problema]
    
	static constraints = {
		
		nombreUsuario (blank:false)
		apellidoPaterno (blank:false)
		apellidoMaterno (blank:false)
		mail (blank:false,email:true,unique:true)
		facebook (nullable:true,blank:true) //Strings que puedan ser dejadas en blanco, deben ser nullables, y blank.
		twitter (nullable:true,blank:true)
		mensaje (nullable:true,blank:true)
		//problemasPendientes(nullable:true)
		matricula (blank:false,unique:true)
		carrera (blank:false)
		
    }
}
