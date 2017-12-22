import java.io.IOException;
import java.time.LocalTime;
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
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Flight;
import com.infotel.travel.service.TravelService;
import com.infotel.travel.service.TravelServiceImpl;

/**
 * Servlet implementation class findflight
 */
public class FindFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindFlight() {
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
		
		List<Flight> vols = new ArrayList<Flight>();
        String dep =request.getParameter("depart_city");
        String des =request.getParameter("arrival_city");
        String heure_dep =request.getParameter("departure_date");
		
		try {
			vols = travelService.findFlight(dep, des, heure_dep);
			System.out.println(vols.get(1).getDeparture());
		} catch (TravelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("vols", vols);
		RequestDispatcher dispatcher = sc.getRequestDispatcher("/flight_list.jsp");
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
