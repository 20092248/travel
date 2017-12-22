import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Flight;
import com.infotel.travel.service.TravelService;
import com.infotel.travel.service.TravelServiceImpl;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		ServletContext sc = request.getServletContext();
		
		TravelService travelService = new TravelServiceImpl();
		List<Airport> airports = new ArrayList<Airport>();
		
		try {
			airports = travelService.AllCity();
			
		} catch (TravelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("airports", airports);
		RequestDispatcher dispatcher = sc.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
