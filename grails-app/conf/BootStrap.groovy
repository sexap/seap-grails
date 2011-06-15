import com.seap.Role
import com.seap.User
import com.seap.UserRole

class BootStrap {

	def springSecurityService
    def init = { servletContext ->
		
		if (!User.count()) {

			def administrador = new Role(authority: 'ROL_ADMINISTRADOR').save(flush: true)
			def estudiante = new Role(authority: 'ROL_ESTUDIANTE').save(flush: true)
			def profesor = new Role(authority: 'ROL_PROFESOR').save(flush: true)

			String password = springSecurityService.encodePassword('admin')
			def testUser = new User(username: 'admin', enabled: true, password: password)
			testUser.save(flush: true)
			
			String password1 = springSecurityService.encodePassword('estudiante')
			def testUser1 = new User(username: 'estudiante', enabled: true, password: password1)
			testUser1.save(flush: true)
			
			String password2 = springSecurityService.encodePassword('profesor')
			def testUser2 = new User(username: 'profesor', enabled: true, password: password2)
			testUser2.save(flush: true)

			UserRole.create testUser, administrador, true
			UserRole.create testUser1, estudiante, true
			UserRole.create testUser2, profesor, true
			
			assert User.count() == 3
			assert Role.count() == 3
			assert UserRole.count() == 3
		}
    
		
	}
	
    def destroy = {
    }
}
