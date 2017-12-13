import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import sun.font.CreatedFontTracker;

public class WriteTxt3 {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	
	public ArrayList<Wifi> ListTest1;
	public ArrayList<Wifi> ListLiner;
	public ArrayList<Wifi> tempcount;
	public ArrayList<Wifi> Sort_tempcount;
	public ArrayList<Wifi> Fix_tempcount;
	public ArrayList<CompareWifi2> result_mac;
	
	/**
	 * @throws IOException 
	 * @The class that incharge  all the procces
	 * of writing to Arraylist.
	 * It manipulate them from ,csv file until the orgnized csv file
	 * whice the the filter class work with.
	 */
	
	public WriteTxt3() throws IOException
	{
		createTest1List();
	}
	public void createTest1List() throws IOException
	{  
		/** 
		 *  convert all the csv file to one
		 * csv file.
		 * after that he convert the csv file to
		 * Array list(Wifi element) which will used int the next function.
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
	
		System.out.println("---STARTING PROCCESS-WAIT FOR THE LOADING BAR----");
        Read readtext1=new Read();
        readtext1.setCsvfilename("test1");
        readtext1.convertcsvtotxt();
        readtext1.setLoc(path+"test1.txt");
        
        //ListTest1=readtext1.converttocsv();
       ListLiner=readtext1.converttocsv();
	}
 	
 	public void Writewifi_liner(int i) throws IOException 
	{    
 		/**
 		 * The function that create the lines in the of the orgnized csv file.
 		 * the function get the choosen line(the one that you want to compare the rest) and compare it to the rest of the lines,once 
 		 * its find the same object its add to the list , sort them and clean the duplicate mac addres.
 		 * at the end he return fix_temp count list for the orgnized function .
 		 * (to write the line of the 10 networks).
 		 */
 		
 		
	  if(!ListLiner.get(i).getMac().equals("1"))
	  {  
		    tempcount=new ArrayList<Wifi>();
	 		Wifi dead=new Wifi();
	 		dead.Wifikill("1");
			///---------csv------
		    Start a1=new Start();
		    
		    //////------big file-----
		    tempcount.add(ListLiner.get(i));
			int size=ListLiner.size();
			 /////--------------- 
			
			for(int z=i;z<size;z++)
				 
			{  if(!ListLiner.get(z).getMac().equals("1")&&i!=z)
			   {	
				
					
					
				 CompareWifi com=new CompareWifi(ListLiner);
                    				 
				      
				 
				 if(a1.choose==1) 
	             {if(com.IDComperator(i, z)) {tempcount.add(ListLiner.get(z));ListLiner.set(z,dead );}};
	             if(a1.choose==3) 
	             {if(com.TimeComperator(i, z)) {tempcount.add(ListLiner.get(z));ListLiner.set(z,dead );}};
	             if(a1.choose==4) 
	             {if(com.LocComperator(i, z)) {tempcount.add(ListLiner.get(z));ListLiner.set(z,dead );}};
	             if(a1.choose==6) 
	             {if(com.MacComperator(i, z)) {tempcount.add(ListLiner.get(z));ListLiner.set(z,dead );}};
	             if(a1.choose==5) 
	             {if(com.AllComperator(i, z)) {tempcount.add(ListLiner.get(z));ListLiner.set(z,dead );}};
	             
			           
			           
			             
			       
				 
			   }
				
			}
			
			
			
			////--------	 
			 
			 
			 ////-----------------
	
		     Sort sort=new Sort();
		     sort.setCsv2(tempcount);
		     Sort_tempcount=new ArrayList<Wifi>();
		     Fix_tempcount=new ArrayList<Wifi>();
			 Sort_tempcount=sort.SortSignal();
		     Calculate1 calc1=new Calculate1(Sort_tempcount);
		     calc1.runCalculate1();
		     this.result_mac=new ArrayList<>(calc1.result);
		   
	  }    
	    
}
 	
 	public void WriteMacalgo() throws IOException
	{  
		/**
		 * call the liner function inorder to create the lines of the 
		 * orgnized csv file.
		 * each time the liner function return new arraylist .
		 *     
		 */
	
	    //--------------����� ���� 
	    File file2 = new File("MacByCalc_1.csv");
	    file2.createNewFile();
	    FileWriter writer = new FileWriter(file2); 
	    //----------------------------------
	   // Writes the content to the file
	     
	     
	     
	     int x=ListLiner.size();

	  ///--------------------------------------
	     
	    
	    
	     writer.write("MAC ,lat,Lot,hight") ;  
	     writer.write(System.lineSeparator());
         ///-------����� ������------
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
	    	  
	    	//----�������� ���� �� � ���� ������
	       if(!ListLiner.get(i).getMac().equals("1"))
	        {
	    	   Writewifi_liner(i);
	            ////--------------
		       
		    	
		    	/////---------
		    	
		    	
		    	
			    
			     ///-----------
				
		    		writer.write(result_mac.get(0).getMac()+","+result_mac.get(0).getLat()+","+result_mac.get(0).getLot()+","+result_mac.get(0).getHight());
		    	
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

	

 
}
