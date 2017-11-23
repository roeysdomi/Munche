import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_Junit {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	
	
	
	@Test
	public  void Checkfiles() 
	{ 
		System.out.println("=====================CHECK-FILES-TEST==================");
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println();
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
	  
	  if(count==9&&checkcsv==1) {a=true;System.out.println("Checkfiles-SUCCSES!-no missing files");}
	  if(count!=9||checkcsv==0) {a=false;System.out.println("Checkfiles-Fail!-Missing files");}
      assertTrue(a);
		
	}
	@Test
	public void CheckContent() throws IOException 
	{ 
		System.out.println("=====================CHECK-CONTENT-TEST==================");
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println();

		Start run=new Start();
		run.Start();
	   Wifi check=new Wifi();
	   boolean a=check.failtesting;
	   int syso=0;
	   if(a==false&&syso==0) {System.out.println("CheckContent-FAIL!-WRONG CONTANT");syso=1;}
       assertTrue(a);
		
	}
	@Test
	public void CheckChoise() throws IOException 
	{    System.out.println("=====================CHECK-CHOISE-TEST==================");
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println("****Enter wrong number if u want fail ***");

		Start run=new Start();
		run.Start();
		 boolean a=run.failtesting;
       assertTrue(a);
		
	}
	
    
}
