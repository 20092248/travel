package com.infotel.travel.dao;

import java.util.List;

public interface TravelDao<T> {
	
	T find(Integer id);
	
	T remove(Integer id);
	
	boolean create(T object);
	
	List<T> listAll();
	
	List<T> findByKeyword(String keyword);

}
