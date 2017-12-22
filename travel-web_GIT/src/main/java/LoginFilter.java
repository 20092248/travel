import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import com.infotel.travel.dao.FlightDao;
import com.infotel.travel.dao.jdbc.FlightDaoJdbc2;

public class LoginFilter implements Filter {

	private static final Logger LOGGER = Logger.getLogger(LoginFilter.class);
	
	public void init(FilterConfig fc) throws ServletException {
		// TODO Auto-generated method stub
		FlightDao flightDao = new FlightDaoJdbc2();

	}
	
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		HttpSession session = request.getSession(true);
		
		Object o = session.getAttribute("user");
		LOGGER.info(o);
		
		if(o==null) 
			response.sendRedirect(request.getContextPath()+"/formulaire.jsp");
		else 
			chain.doFilter(request, response);
		
	}



}
