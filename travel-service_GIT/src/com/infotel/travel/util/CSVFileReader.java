package com.infotel.travel.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader implements CSVReader {

	private CSVParser parser;

	public CSVFileReader(CSVParser parser) {
		this.parser = parser;
	}

//	String[][] augmenteTableau(String mat[][],int colSize)
//	{
//		String newmat[][] = new String[mat.length+1][colSize];
//		for (int i=0;i<mat.length;i++)
//			for (int j=0;j<colSize;j++)
//				newmat[i][j]=mat[i][j];
//		return newmat;
//	}
	
	@Override
	public List parse(String fileName) {
		return this.parse(fileName,false);
	}
	
	@Override
	public List parse(String fileName,boolean header) {
		
		List result = new ArrayList(); 
		boolean firstLine = true;
		try {
			String s; 
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			while((s = br.readLine()) != null) { 
				if (!(header && firstLine)) {					
					List listDesChamps = parser.parseLine(s);
					result.add(listDesChamps);
				}
				firstLine=false;
			} 
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}

	@Override
	public List parse(String[] lines) {
		return null;
	}

}
