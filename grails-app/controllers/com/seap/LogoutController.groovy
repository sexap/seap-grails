package com.seap
import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils
import grails.plugins.springsecurity.Secured

class LogoutController {
	
	def springSecurityService

	/**
	 * Index action. Redirects to the Spring security logout uri.
	 */
	
	@Secured("hasAnyRole('ROL_ADMINISTRADOR','ROL_ESTUDIANTE','ROL_PROFESOR')")
	def index = {
		// TODO  put any pre-logout code here
		redirect uri: SpringSecurityUtils.securityConfig.logout.filterProcessesUrl // '/j_spring_security_logout'
	}
}
