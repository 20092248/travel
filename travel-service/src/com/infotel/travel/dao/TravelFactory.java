//package com.infotel.travel.dao;
//
//import java.util.Date;
//import java.util.List;
//
//import com.infotel.travel.model.Accomodation;
//import com.infotel.travel.model.AccomodationType;
//import com.infotel.travel.model.Flight;
//import com.infotel.travel.model.Ticket;
//import com.infotel.travel.util.MiscUtils;
//
//public class TravelFactory {
//
//	public static Object create(char c, List<String> line) {
//
//		switch (c) {
//		case 'A':
//			return createAccomodation(line);
//		case 'T':
//			return createTicket(line);
//		case 'F':
//			return createFlight(line);
//		}
//		throw new IllegalArgumentException("Element inconnu " + c);
//	}
//
//	private static Accomodation createAccomodation(List<String> line) {
//		Accomodation accomodation = null;
//		try {
//			int id = Integer.parseInt( line.get(0));
//			int price = Integer.parseInt( line.get(1));
//			String name = (String) line.get(2);
//			String type = ( line.get(3)).toUpperCase();
//			String address = (String) line.get(4);
//			String distance = (String) line.get(5);
//			int stars = Integer.parseInt( line.get(6));
//			boolean cancellation = ( line.get(7)).toUpperCase().equals("Y");
//			float longitude = Float.parseFloat( line.get(8));
//			float latitude = Float.parseFloat( line.get(9));
//			String imgStr = ( line.get(10));
//			int imageId = imgStr.equals("NULL") ? 0 : Integer.parseInt(imgStr);
//
//			AccomodationType at = AccomodationType.valueOf(type);
//			accomodation = new Accomodation(id, price);
//			accomodation.setInformation(name, address, distance);
//			accomodation.getInformation().setStars(stars);
//		} catch (Exception ex) {
//			System.err.println(line);
//		}
//		return accomodation;
//	}
//
//	private static Flight createFlight(List<String> line) {
//		Flight flight = null;
//		try {
//			int id = Integer.parseInt( line.get(0));
//			String fnumber = (String) line.get(1);
//			String dep = (String) line.get(4);
//			String arr = (String) line.get(5);
//			String equip = ( line.get(7));
//
//			flight = new Flight(id, fnumber, dep, arr, equip);
//		} catch (Exception ex) {
//			System.err.println(line);
//		}
//		return flight;
//	}
//
//	private static Ticket createTicket(List<String> line) {
//		Ticket ticket = null;		
//		
//		try {
//			int id = Integer.parseInt( line.get(0));
//			Date odate = MiscUtils.parse(line.get(4));
//			Date idate = MiscUtils.parse(line.get(5));
//			int nbp = Integer.parseInt( line.get(1));
//			int price = Integer.parseInt( line.get(7));
//			ticket = new Ticket(id);
//			ticket.setId(id);
//			ticket.setInWardDate(idate);
//			ticket.setOutWardDate(odate);
//			ticket.setNbrPassengers(nbp);
//			ticket.setTotalPrice(price);
//			
//		} catch (Exception ex) {
//			System.err.println(line);
//		}
//		return ticket;
//	}
//
//}
