//package com.infotel.travel.util;
//
//import java.util.Comparator;
//
//import com.infotel.travel.model.Accomodation;
//
//public class AccComparator implements Comparator {
//
//	SortType typeOfSort;
//	boolean ascendant;
//	
//	public AccComparator(SortType typeOfSort,boolean asc) {
//		this.typeOfSort = typeOfSort;
//		this.ascendant = asc;
//	}
//	public AccComparator(SortType typeOfSort) {
//		this(typeOfSort,true);
//	}
//
//	
//
//	public SortType getTypeOfSort() {
//		return typeOfSort;
//	}
//
//
//
//	public void setTypeOfSort(SortType typeOfSort) {
//		this.typeOfSort = typeOfSort;
//	}
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		return (ascendant ? 1 : -1) * mycompare(o1,o2);
//	}
//	
//	private int mycompare(Object o1, Object o2) {
//		Accomodation premier=(Accomodation)o1;
//		Accomodation second=(Accomodation)o2;
//
//
//		switch (typeOfSort) {
//		case ID :
//			if (premier.getId()>second.getId()) return 1;
//			if (premier.getId()<second.getId()) return -1;
//			break;
//		case STARS : 
//			int pstars = 
//			(premier.getInformation()!=null ? premier.getInformation().getStars() : 0);
//			int sstars = 
//			(second.getInformation()!=null ? second.getInformation().getStars() : 0);
//			if (pstars>sstars) return 1;
//			if (pstars<sstars) return -1;
//			break;
//		case NAME :
//			String pname = 
//					(premier.getInformation()!=null ? premier.getInformation().getName() : "");
//			String sname = 
//					(second.getInformation()!=null ? second.getInformation().getName() : "");
//			return pname.compareTo(sname);
//		case RANDOM :
//			if (Math.random()>0.5) return 1;
//			return -1;
//		case PRICE :
//			int aprice = 0;
//			try { aprice = (int)Float.parseFloat(second.getPrice());	}
//			catch (Exception e) {}
//		
//			int mprice = 0;
//			try { mprice = (int)Float.parseFloat(premier.getPrice());	}
//			catch (Exception e) {}
//			if (mprice>aprice) return 1;
//			if (aprice>mprice) return -1;			
//		}
//		return 0;
//	}
//
//}
