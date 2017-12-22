package com.infotel.travel.dao.jdbc;

import java.sql.ResultSet;

import com.infotel.travel.dao.AccomodationImageDao;
import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;
import com.infotel.travel.model.AccomodationImage;

public class AccomodationImageDaoJdbc extends AbstractDaoJdbc implements AccomodationImageDao{

	@Override
	public AccomodationImage findById(int id) throws TravelException{
		// TODO Auto-generated method stub
		AccomodationImage ai;
		try {
			String sql = "SELECT * from accomodation_image where id = "+id;
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
				ai = new AccomodationImage();
				ai.setId(rs.getInt("id"));
				ai.setContent(rs.getBytes("content"));
			}else {
				throw new TravelException("Identifiant de l'image est invalide");
			}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return ai;
	}
	
	@Override
	public AccomodationImage findByAccomodationid(int id) throws TravelException{
		// TODO Auto-generated method stub
		AccomodationImage ai;
		try {
			String sql = "select i.* from accomodation_image i, accomodation a  where a.id = "+ id +" and a.image_id = i.id";
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
			if(rs.next()) {
				ai = new AccomodationImage();
				ai.setId(rs.getInt("id"));
				ai.setContent(rs.getBytes("content"));
			}else {
				throw new TravelException("Identifiant de l'image est invalide");
			}
		}catch (Exception e) {
				throw new TravelException(e.getMessage());
			}
		return ai;
	}
	
	
	
	
	public static void main(String[] args) {
		AccomodationImageDaoJdbc aijdbc = new AccomodationImageDaoJdbc();
		try {
			System.out.println(aijdbc.findById(520).getContent());
			
		} catch (TravelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
