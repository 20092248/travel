

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Flight;
import com.infotel.travel.model.Ticket;
import com.infotel.travel.service.BookingService;
import com.infotel.travel.service.BookingServiceImpl;
import com.infotel.travel.service.TravelService;
import com.infotel.travel.service.TravelServiceImpl;

/**
 * Servlet implementation class GetFlightNo
 */
public class GetFlightNo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFlightNo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession(false);
		ServletContext sc = request.getServletContext();
		TravelService travelService = new TravelServiceImpl();

		int flight_id = Integer.parseInt(request.getParameter("flightid"));
		System.out.println("\n\n"+flight_id+"\n\n");
		try {
			Flight flight_info = travelService.findFlightById(flight_id);
			System.out.println(flight_info);
			session.setAttribute("flight_info", flight_info);
			RequestDispatcher dispatcher = sc.getRequestDispatcher("/flight_detail.jsp");
			dispatcher.forward(request, response);
		} catch (TravelException e) {
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
