package Com.Controller;
import  Com.dto.Contact;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Com.Model.ContactModel;
/**
 * Servlet implementation class CreateController
 */
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
		String contact=request.getParameter("con");
		String email=request.getParameter("em");
		Contact cont=new Contact();
		cont.setName(name);
		cont.setContact(contact);
		cont.setEmail(email);
	    ContactModel cm=new ContactModel();
	int result=cm.save(cont);
	if(result>0) {
		response.sendRedirect("CreateContact.jsp?msg=Contact saved Successfully");
	}
	else {
		response.sendRedirect("CreateContact.jsp?msg=contact not saved successfully");
	}
	}
}
