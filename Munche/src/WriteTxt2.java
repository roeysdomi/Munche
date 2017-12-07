import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteTxt2 {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	public ArrayList<String> ListUniqWifi;
	public ArrayList<String> ListTest1;
	public ArrayList<String> ListLiner;
	public ArrayList<String> tempcount;
	public ArrayList<String> Sort_tempcount;
	public ArrayList<String> Fix_tempcount;
	
	
	
	public WriteTxt2()
	{
		
	}
	public void createTest1List() throws IOException
	{   File file3=new File(path+"test1.csv");
		file3.createNewFile();
		File folder = new File(csvpath);
		File[] listOfFiles = folder.listFiles();
	    FileWriter writer=new FileWriter(path+"test1.csv");
		for (File file : listOfFiles) {
			if (file.isFile())
			{
		        String g=file.getName();
		    
			
		    Scanner scanner = new Scanner(new File(csvpath+g));
		    scanner.useDelimiter(",");
	
		    while(scanner.hasNext()){
		    	String line=scanner.next();
		        writer.write(line+",");
		    }
		    
	
		    scanner.close();
		    }
	      
		} 
		writer.close();
	
		System.out.println("---STARTING PROCCESS-WAIT FOR THE LOADING BAR----");
        Read readtext1=new Read();
        readtext1.setCsvfilename("test1");
        readtext1.convertcsvtotxt();
        readtext1.setLoc(path+"test1.txt");
        
        ListTest1=readtext1.converttocsv();
        ListLiner=readtext1.converttocsv();
	}
 	
 	public void Writewifi_liner(int i) throws IOException 
	{    
	  if(!ListLiner.get(i).equals("1"))
	  {  
		    tempcount=new ArrayList<String>();
	 		
			///---------csv------
		    Start a1=new Start();
		    
		    //////------big file-----
		    
			int size=ListLiner.size();
			 /////--------------- 
			Wifi wifi1=new Wifi(ListLiner.get(i));
			for(int z=i;z<size;z++)
				 
			{  if(!ListLiner.get(z).equals("1"))
			   {	
					
					
				   
				 Wifi wifi2=new Wifi(ListLiner.get(z));
				 
				 
				 
						if(a1.choose==1) 
			             {if(wifi1.IDComperator(wifi1, wifi2)) {tempcount.add(ListLiner.get(z));ListLiner.set(z, "1");}};
			             if(a1.choose==3) 
			             {if(wifi1.TimeComperator(wifi1, wifi2)) {tempcount.add(ListLiner.get(z));ListLiner.set(z, "1");}};
			             if(a1.choose==4) 
			             {if(wifi1.LocComperator(wifi1, wifi2)) {tempcount.add(ListLiner.get(z));ListLiner.set(z, "1");}};
			             if(a1.choose==5) 
			             {if(wifi1.BigComperator(wifi1, wifi2)) {tempcount.add(ListLiner.get(z));ListLiner.set(z, "1");}};
				
				 
			   }
				
			}
			
			
			
			
			////--------	 
			 
			 
			 ////-----------------
	
		     Sort sort=new Sort();
		     sort.setCsv(tempcount);
		     Sort_tempcount=new ArrayList<String>();
		     Fix_tempcount=new ArrayList<String>();
			 Sort_tempcount=sort.SortSignal();
		     ///------------------
			 Writefixmac();
			
		     /////--------------------
		     
		   
	  }    
	    
}
 	public void Writefixmac() throws IOException
	{   
		////--------------------
		ArrayList<String>temp=new ArrayList<>(Sort_tempcount);
		Fix_tempcount=new ArrayList<>();
		////------------------
		for(int t=0;t<temp.size();t++)
		 { 
			if(!temp.get(t).equals("1"))
			{
				  Wifi wifi1=new Wifi (temp.get(t));
				   
				   Fix_tempcount.add(temp.get(t));
					for(int y=0;y<temp.size();y++)
				  {  if(!temp.get(y).equals("1"))
					    {
					        Wifi wifi2=new Wifi (temp.get(y));
					        if( wifi1.Comperator(wifi1.getMac(), wifi2.getMac())&&t!=y)
					        {  temp.set(y,"1"); }
					    }
				  }
			  
			}
		 } 
	 ////---------------------
		 
		 
		 
		 
		
	}
 	public void WriteOrgnized() throws IOException
	{  
		/*   יוצר את המסמך הממוין לפי המיון שבחרנו בכל שורה עד 10 הכי חזקים */    
	
	    //--------------יצירת מסמך 
	    File file2 = new File("orgnized.csv");
	    file2.createNewFile();
	    FileWriter writer = new FileWriter(file2); 
	    //----------------------------------
	   // Writes the content to the file
	     
	     
	     
	     int x=ListTest1.size();

	  ///--------------------------------------
	     
	     writer.write("WigleWifi-1.4,appRelease=2.25,model=ONEPLUS A3003,release=7.1.1,device=OnePlus3T,display=ONEPLUS A3003_28_171012,board=QC_Reference_Phone,brand=OnePlus");
	     writer.write(System.lineSeparator());
	     writer.write("WIFI#,");
	     for(int k=1;k<11;k++)
	     {writer.write("MAC-"+k+",SSID-"+k+",FirstSeen-"+k+",RSSI-"+k+",CurrentLatitude-"+k+",CurrentLongitude-"+k+",AltitudeMeters-"+k+",") ;  };
	     writer.write(System.lineSeparator());
         ///-------חישוב אחוזים------
	     double all=x*0.01;
	     int all2=(int)all;
	     int count1=0;
	     int counter=0;
	      for(int i=0;i<x;i++)
	      { 
	    	  count1++;
	    	  if(count1==all2+1)
	    	  {
	          System.out.println("        ||procces:("+counter+"%)||");
	          counter++;
	          count1=0;
	          }
	    	  
	    	//----יוצרמסמך זמני של ה האיי הראשון
	       if(!ListLiner.get(i).equals("1"))
	        {
	    	   Writewifi_liner(i);
	            ////--------------
		       
		    	int z=Fix_tempcount.size();
	
		    	writer.write(z+",");
		    	/////---------
		    	
		    	
		    	
			     ArrayList<String> csv2=new ArrayList<>(Fix_tempcount);
			     ///-----------
					for(int count=0;count<z;count++)
		    	{   if(count<=10)
		    		{ Wifi w=new Wifi(csv2.get(count));
		    		  
		    		writer.write(w.getMac()+","+w.getId()+","+w.getTime()+","+w.getSignal()+","+w.getLat()+","+w.getLot()+","+w.getHight()+",");
		    		}
		    	}
					writer.write(System.lineSeparator());
		    	
		    	
		      }  
	      }
	       ///////////////////////////////////////////////////////
			    writer.close();
			    int rest=100-counter;
			    for( int r=0;r<=rest;r++)
			    {
			    	System.out.println("        ||procces:("+counter+++"%)||");
			    }
			   
	      } 

	

 public static void main (String[]args) throws IOException 
 {
	 WriteTxt2 run=new WriteTxt2();
	 System.out.println("start");
	 run.createTest1List();
	 System.out.println("created test1list");

	 
	// run.WriteUniqWifi();
	 System.out.println("created Uniqwifilist");
	 run.WriteOrgnized();
	 System.out.println("finsehd");
	 
 }
}
