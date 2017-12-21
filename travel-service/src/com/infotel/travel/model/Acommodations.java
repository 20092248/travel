package com.infotel.travel.model;

import java.util.List;

public class Acommodations {
	List acommodations;
	
	public Acommodations(List acommodations) {
		this.acommodations = acommodations;
	}

	public Accomodation find(Integer id) {
		Accomodation trouve = null;
		int i=0;
		while (trouve==null) {
			Accomodation temp = (Accomodation)acommodations.get(i);
			i++;
			if (temp!=null && id.equals(temp.getId()))
				trouve = temp;
		}
		return trouve;
	}
	
	Accomodation remove(Integer id) {
		return null;
	}
	
	Accomodation update(Integer id,Accomodation newAccomodation) {
		return null;
	}
	
}
