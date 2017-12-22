package com.infotel.travel.util;

import java.util.Arrays;
import java.util.List;

public class CSVParser {

	private char sep;
	private char quotes;
	
	public CSVParser(char sep, char quotes) {
		this.sep = sep;
		this.quotes = quotes ;
	}

	public List parseLine(String line) {
		String[] cols = line.replace(Character.toString(quotes),"").split(Character.toString(sep));
		return Arrays.asList(cols);
	}
}
