/**
 * 
 */
package org.openmrs.module.mohtracportal.web.controller;

import org.openmrs.layout.LayoutSupport;
import org.openmrs.layout.address.AddressSupport;
import org.openmrs.web.controller.layout.LayoutPortletController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Yves GAKUBA
 *
 */
public class MohTracPortalWelcomePagePortletController extends
		LayoutPortletController {

	/* (non-Javadoc)
	 * @see org.openmrs.web.controller.layout.LayoutPortletController#getLayoutSupportInstance()
	 */
	@Override
	protected LayoutSupport getLayoutSupportInstance() {
		return AddressSupport.getInstance();
	}
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView mav = super.handleRequest(request, response);
		String portletPath = "/module/mohtracportal/portlets/welcome";
		mav.setViewName(portletPath);
		
//		Map<String, Object> mohPortalObjects = new HashMap<String, Object>();
//
//		mohPortalObjects.put("authUser", Context.getAuthenticatedUser());
//
//		request.setAttribute("mohPortalObjects", mohPortalObjects);
		
		return mav;
	}

}
