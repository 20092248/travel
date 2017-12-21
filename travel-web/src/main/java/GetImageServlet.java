
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infotel.travel.dao.AccomodationDao;
import com.infotel.travel.dao.AccomodationImageDao;
import com.infotel.travel.dao.jdbc.AccomodationImageDaoJdbc;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Airline;
import com.infotel.travel.model.Airport;
import com.infotel.travel.model.Flight;
import com.infotel.travel.service.BookingService;
import com.infotel.travel.service.BookingServiceImpl;

/**
 * Servlet implementation class GetImageServlet
 */

public class GetImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookingService book = new BookingServiceImpl();
		
		response.setContentType("image/png");
		ServletContext sc = request.getServletContext();
		ByteArrayInputStream byteIMg = null; 
		
		try {
			byteIMg = new ByteArrayInputStream(book.findImageId(5).getContent());
			System.out.println(book.findImageId(5).getContent());
		} catch (TravelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedImage bi = ImageIO.read(byteIMg);
		OutputStream os = response.getOutputStream();
		ImageIO.write(bi, "PNG", os);
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
