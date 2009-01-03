import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Filterfunc {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
    public static int  choose;
    //-------Description of the class: write to files function and coverting functions.
  //-------description is  inside any function as well.---

		
	public void convertcsvtotxt(String fileloc) throws IOException
	{ /*  ממיר קובץ סיאססויי למסמך טקסט(צריך להכניס מיקום) בסטרינג.*/
		
		File file1=new File(path+fileloc+".txt");
		file1.createNewFile();
		FileWriter writer= new FileWriter(file1);
	    Scanner scanner = new Scanner(new File(path+fileloc+".csv"));
	    scanner.useDelimiter(",");

	    while(scanner.hasNext()){
	    	String line=scanner.next();
	        writer.write(line+",");
	    }
	    writer.close();
	    scanner.close();
	}
}
	
	
