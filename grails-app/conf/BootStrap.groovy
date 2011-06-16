import com.seap.Role
import com.seap.Usuario
import com.seap.UserRole
import com.seap.Dificultad
import com.seap.TipoActividad

class BootStrap {

	def springSecurityService
    def init = { servletContext ->
		
		if (!Usuario.count()) {
			
						def administrador = new Role(authority: 'ROL_ADMINISTRADOR').save(flush: true)
						def estudiante = new Role(authority: 'ROL_ESTUDIANTE').save(flush: true)
						def profesor = new Role(authority: 'ROL_PROFESOR').save(flush: true)
			
						String password = springSecurityService.encodePassword('admin')
						def testUser = new Usuario(username: "admin", enabled: true, password: password, nombreUsuario: "Administrador", apellidoPaterno: "Godinez", apellidoMaterno: "Perez", mail: "administrador@gmail.com", matricula: "4464584", facebook: "admin", twitter: "admin", mensaje: "nada por aqui, nada por alla", carrera: "Computacion")
						testUser.save(flush: true)
						
						String password1 = springSecurityService.encodePassword('estudiante')
						def testUser1 = new Usuario(username: "rvargas", enabled: true, password: password1, nombreUsuario: "Rafael", apellidoPaterno: "Vargas", apellidoMaterno: "Rosas", mail: "al208337005@alumnos.azc.uam.mx", matricula: "208337005", carrera: "Computacion")
						testUser1.save(flush: true)
						
						String password2 = springSecurityService.encodePassword('profesor')
						def testUser2 = new Usuario(username: "franz", enabled: true, password: password2, nombreUsuario: "Francisco", apellidoPaterno: "Zaragoza", apellidoMaterno: "Martinez", mail: "franz@correo.azc.uam.mx", matricula: "6782567", carrera: "Computacion")
						testUser2.save(flush: true)
						
						UserRole.create testUser, administrador, true
						UserRole.create testUser1, estudiante, true
						UserRole.create testUser2, profesor, true
					
						assert Usuario.count() == 3
						assert Role.count() == 3
						assert UserRole.count() == 3
		}
					
					if(!Dificultad.count()){
						new Dificultad(nombreDificultad: "Principiante").save(flush: true)
						new Dificultad(nombreDificultad: "Intermedio").save(flush: true)
						new Dificultad(nombreDificultad: "Avanzado").save(flush: true)
						
						assert Dificultad.count() == 3
					}
					
					if(!TipoActividad.count()){
						new TipoActividad(tipoActividad: "Tarea").save(flush:true)
						new TipoActividad(tipoActividad: "Examen").save(flush:true)
						new TipoActividad(tipoActividad: "Ejercicios").save(flush:true)
						
						assert TipoActividad.count() == 3
					}
    
	}
	
    def destroy = {
    }
}
