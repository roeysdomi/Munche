import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Writetxt {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	ArrayList<String> csv;
	
	
	
	
	public void WriteUniqWifi() throws IOException
	{    
		/* מקבל:מס עמודות,מס שורות,וסטרינג.
	          אשר מכיל רק פרמטרים שונים לפי סוג המיון unicwifi פעולה:על פי סוג המיון שהמשתמש בוחר הפונקציה יוצרת מסמך יחודי בשם 
	        לאחר מכן הם ישומשו על מנת ליצור קבוצות של ה10 הכי חזקות לפי כל שורה במסמך שיצרנו פה.
	   */
		
		 Start a1=new Start();
		 File file2 = new File(path+"unicwifi.txt");
	   
	 
	    
	    // creates a FileWriter Object
	    FileWriter writer = new FileWriter(file2); 
	    
		    //-כתיבת השאר	   
	    ArrayList<String>temp=csv;
	
		for(int i=0;i<temp.size();i++)
		{
		  if(!temp.get(i).equals("1"))
		  {
			
				writer.write(temp.get(i));
				writer.write(System.lineSeparator());
			
			
			Wifi wifi1=new Wifi(temp.get(i));
         ////-----------לולאה השנייה----
			if(a1.choose!=4)
			{
				for(int j=0;j<temp.size();j++)
			 {    Wifi wifi2=new Wifi(temp.get(j));
                if(a1.choose==1)
                {
				if(wifi1.Comperator(wifi1.getId(), wifi2.getId())&&i!=j)
				 {temp.set(j,"1");}
                }
                if(a1.choose==3)
                {
				if(wifi1.Comperator(wifi1.getTime(), wifi2.getTime()))
				 {temp.set(j,"1");}
                }
                
				
			 }
			}
			
			/////-----מקרה של מיקום---
			if(a1.choose==4)
			{
				for(int j=0;j<temp.size();j++)
				{   Wifi wifi2=new Wifi(temp.get(j));
					if(wifi1.Comperator(wifi1.getLat(),wifi2.getLat())&&wifi1.Comperator(wifi1.getLot(),wifi2.getLot())&&wifi1.Comperator(wifi1.getHight(),wifi2.getHight())&&j!=i)
					{ temp.set(j,"1") ;  }
					
				}
			
			}
		  }
		}
		    
		   
		    writer.close();
		   
		
	}
	public void Writefixmac() throws IOException
	{   ///----------create fixmac-------
		File file1=new File(path+"fixmac.txt");
		file1.createNewFile();
		FileWriter writer=new FileWriter(file1);
		////--------------------
		ArrayList<String>temp=csv;
		////------------------
		for(int t=0;t<temp.size();t++)
	 { 
		if(!temp.get(t).equals("1"))
		{
		  Wifi wifi1=new Wifi (temp.get(t));
		   writer.write(temp.get(t));
		   writer.write(System.lineSeparator());
		   
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
		 
		 
		 
		 
		 writer.close();
		}
	public void Writetext1() throws IOException
	{/* מאחד את כל קבצי csv 
	    לקובץ אחד
	 */
		File file3=new File(path+"test1.csv");
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
		}

	public void Writewifi_liner(ArrayList<String> csv,int i) throws IOException 
	{    
		/*  מקבל: סטרינג של מטריצה של uniqwifi
		 * ומספר שורה להתמקד עליה בסטרינג הזה.
		פעולה:הוא הולך למספר שורה שעליה הוא התמקד
	   הולך למסמך המקורי שמכיל את הכל ובודק כמה שורות עם הפרמטר של אותו שורה שהתמקדנו עליה יש כמוהו
	  . tempcount אם הוא מצא הוא סופר את זה(Z++) ומכניס למסמך זמני בשם 
	     בסוף:מחזיר את מספר השורות במסמך המקורי שמכילות את אותו פרמטר וגם יוצר את המסמך הזמני.
	 */
		Start a1= new Start();
		File file = new File(path+"tempcount.txt");
		
	    file.createNewFile();
	    
	    // creates a FileWriter Object
	    FileWriter writer = new FileWriter(file);  
		
		///---------csv------
	    ArrayList<String> temp1=csv;
	    
	    //////------big file-----
	    String loc2=path+"test1.txt";
	    
		Read read=new Read();
		read.setLoc(loc2);
		ArrayList<String>temp2 =read.converttocsv();
		 /////--------------- 
		int r=0;
		for(int z=0;z<temp2.size();z++)
		{
			 Wifi wifi2=new Wifi(temp2.get(z));
			 Wifi wifi1=new Wifi(temp1.get(i));
			 
			 if(a1.choose==1)
			 {    
				 if(wifi2.Comperator(wifi1.getId(), wifi2.getId()))
				 {
					 writer.write(temp2.get(z));
				    writer.write(System.lineSeparator());
				    r++;}
			 }
			 
			 if(a1.choose==3)
			 {
				 if(wifi1.Comperator(wifi1.getTime(), wifi2.getTime()))
				  {writer.write(temp2.get(z));writer.write(System.lineSeparator());}
			 }
			 if(a1.choose==4)
			 {
				 if(wifi1.Comperator(wifi1.getLat(),wifi2.getLat())&&wifi1.Comperator(wifi1.getLot(),wifi2.getLot())&&wifi1.Comperator(wifi1.getHight(),wifi2.getHight()))
				  {writer.write(temp2.get(z));writer.write(System.lineSeparator());}
			 }
			
			 
			
			
		}
		
		
		
		 writer.close();
		////--------	 
		 
		 Read read7=new Read();
		 read7.setLoc(path+"tempcount.txt");
		 ArrayList<String> top=read7.converttocsv();
		 
		 ////-----------------

	     Sort sort=new Sort();
	     sort.setCsv(top);
		 ArrayList<String> top10=sort.SortSignal();
	     ///------------------
		 Writetxt writetxt=new Writetxt();
		 writetxt.setCsv(top10);
	     writetxt.Writefixmac();
	     /////--------------------
	     Read read3=new Read();
		 read3.setLoc(path+"fixmac.txt");
		 top10=read3.converttocsv();
	    
	   
	    
	    
		 	
	   
		 
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
	     Read read1=new Read();
	     read1.setLoc(path+"unicwifi.txt");
	     ArrayList<String> csv=read1.converttocsv();
	     Count co2=new Count();
	     co2.setLoc(path+"unicwifi.txt");
	     int x=co2.countrows();

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
	       
	    	Writewifi_liner(csv, i);
            ////--------------
	        Count co=new Count();
	        co.setLoc(path+"fixmac.txt");
	    	int z=co.countrows();

	    	writer.write(z+",");
	    	/////---------
	    	Read read2=new Read();
		     read2.setLoc(path+"fixmac.txt");
		     ArrayList<String> csv2=read2.converttocsv();
		     ///-----------
				for(int count=0;count<csv2.size();count++)
	    	{   if(count<=10)
	    		{ Wifi w=new Wifi(csv2.get(count));
	    		  
	    		writer.write(w.getMac()+","+w.getId()+","+w.getTime()+","+w.getSignal()+","+w.getLat()+","+w.getLot()+","+w.hight+",");
	    		}
	    	}
				writer.write(System.lineSeparator());
	    	
	    	
	      }  
		    writer.close();
		    int rest=100-counter;
		    for( int i=0;i<=rest;i++)
		    {
		    	System.out.println("        ||procces:("+counter+++"%)||");
		    }
		   
		   

	}
	//---------get and set---------
    public ArrayList<String> getCsv() {
		return csv;
	}
	public void setCsv(ArrayList<String> csv) {
		this.csv = csv;
	}

}


