import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Read {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	String loc;
	String csvfilename;
	
	
	
	public ArrayList<String> converttocsv() throws FileNotFoundException
	{
		/*   מקבל:מיקום של מסמך
	    מחזיר סטרינג של מטריצה    
	 */

		
	int z=0;
	String g;

	File file = new File(loc);

	ArrayList<String> csv1 = new  ArrayList<String>();


		Scanner sc = new Scanner(file);
	   
	    while (sc.hasNextLine()) {
	         g = sc.nextLine();
	        if(!(g.contains("SSID")||g.contains("WigleWifi")||g.contains("GSM")||g==null))
	        {
	          if(!(g.equals(",")))
	          {
	           csv1.add(z++,g);
	           
	        
	          }
	        }
	    }
	  
	   

		return csv1;

	}
	public void convertcsvtotxt() throws IOException
	{ /*  ממיר קובץ סיאססויי למסמך טקסט(צריך להכניס מיקום) בסטרינג.*/
		
		File file1=new File(path+csvfilename+".txt");
		file1.createNewFile();
		FileWriter writer= new FileWriter(file1);
	    Scanner scanner = new Scanner(new File(path+csvfilename+".csv"));
	    scanner.useDelimiter(",");

	    while(scanner.hasNext()){
	    	String line=scanner.next();
	    	
	        writer.write(line+",");
	    }
	    writer.close();
	    scanner.close();
	}
	
	
	
	////-----get and set-----
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getCsvfilename() {
		return csvfilename;
	}
	public void setCsvfilename(String csvfilename) {
		this.csvfilename = csvfilename;
	} 

}
