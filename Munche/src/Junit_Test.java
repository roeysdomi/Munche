import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class 	JunitTest {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	@Test
	public void Checkfiles() 
	{
	 boolean a=false;
	 File folder = new File(path);
     File[] listOfFiles = folder.listFiles();
      int count=0;
      int tryfind=0;
	  while(count<9&&tryfind<40) 
	  {
		     for (int i = 0; i < listOfFiles.length; i++)
		     { 
		    	 if (listOfFiles[i].isFile())
		    	 {
		    		 if(listOfFiles[i].getName().equals("unicwifi.txt")) {count++;}
		    		 if(listOfFiles[i].getName().equals("test1.txt")) {count++;}
		    		 if(listOfFiles[i].getName().equals("test1.csv")) {count++;}
		    		 if(listOfFiles[i].getName().equals("tempcount.txt")) {count++;}
		    		 if(listOfFiles[i].getName().equals("orgnized.txt")) {count++;}
		    		 if(listOfFiles[i].getName().equals("orgnized.csv")) {count++;}
		    		 if(listOfFiles[i].getName().equals("fixmac.txt")) {count++;}
		    		 if(listOfFiles[i].getName().equals("filterd.txt")) {count++;}
		    		 if(listOfFiles[i].getName().equals("filterd.csv")) {count++;}
		    		 
		    	 } 
		    	 
		    	 tryfind++;
		     }
	  }
	  File folder2 = new File(csvpath);
	  File[] listOfFiles2 = folder.listFiles();
	  int checkcsv=1;
	  if(listOfFiles2.length==0) { checkcsv=0;}
	  
	  if(count==9&&checkcsv==1) {a=true;System.out.println("every file is found");}
	  if(count!=9||checkcsv==0) {a=false;System.out.println("====missing file error====");}
    assertTrue(a);
		
	}
	@Test
	public void CheckContent() throws IOException 
	{
		Start run=new Start();
		run.Start();
	   Wifi check=new Wifi();
       assertTrue(check.failtesting);
		
	}
	public void CheckChoise() throws IOException 
	{
		Start run=new Start();
		run.Start();
	   
       assertTrue(run.failtesting);
		
	}
    
    
}
