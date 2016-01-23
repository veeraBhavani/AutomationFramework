package edu.wbqa.util;
import com.csvreader.*;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

public class CsvUtil 
{
public static Object[][] getContactData() throws Exception
{
	List <String[]> items = new ArrayList<String[]>();
	//String[][] items = new String[][5];
	CsvReader csv=new CsvReader(new FileReader(new File("C:\\Users\\Subba\\Desktop\\ContactData.csv")));
	int columns=csv.getColumnCount();
	while(csv.readRecord())
	{
		String[] content=new String[columns];
		content[0]=csv.get(0);
	}
	return new String[5][5];
	
}
}
