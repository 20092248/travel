package com.infotel.travel.util;

import java.util.List;

public interface CSVReader {

	List parse(String fileName);
	
	List parse(String fileName,boolean header);
	
	List parse(String[] lines);
	
}
