/**
 * 
 */
package org.openmrs.module.mohtracportal.web.controller;

import org.openmrs.web.controller.PortletController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Yves GAKUBA
 *
 */
public class MohTracPortalWelcomePagePortletController extends PortletController {
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModelAndView mav = super.handleRequest(request, response);
		String portletPath = "/module/mohtracportal/portlets/welcome";
		mav.setViewName(portletPath);
		return mav;
	}

}
