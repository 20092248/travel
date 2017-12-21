import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.travel.model.Flight;
import com.infotel.travel.service.TravelService;
import com.infotel.travel.service.TravelServiceImpl;



/**
 * Servlet implementation class TopAirline
 */
public class TopAirline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopAirline() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext sc = request.getServletContext();
		TravelService travelService = new TravelServiceImpl();
		
		try {
			travelService.TopAirline(10);
			List<Flight> flights = travelService.TopAirline(10);
			
			request.setAttribute("list_flight", flights);
			RequestDispatcher dispatcher = sc.getRequestDispatcher("/main.jsp");
			dispatcher.forward(request, response);
			System.out.println(flights);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
