import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

public class TravelSessionListener implements HttpSessionListener {

	private static final Logger LOGGER = Logger.getLogger(TravelSessionListener.class);
	
	
	public void sessionCreated(HttpSessionEvent evt) {
		// TODO Auto-generated method stub
		LOGGER.info("Session créée!!!");
		evt.getSession().setAttribute("date_creation", new java.util.Date());
		evt.getSession().toString();
		LOGGER.info(evt.getSession().toString());
		evt.getSession().getMaxInactiveInterval();
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		LOGGER.info("Session détruite!!!");
	}
	
	

}
