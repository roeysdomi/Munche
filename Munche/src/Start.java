import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Start {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	public static int  choose;
	public static Boolean failtesting=true;
	
	
	
	
	public void Start() throws IOException
	{
		 /*  ההפוקנציה שמאחדת בין כל התהליכים ובעצם מתחילה הכל.*/
				Filter filter1=new Filter();
			    
				///-------איחוד קבצי CSV----
		        Writetxt writetxt=new Writetxt();
		        
				writetxt.Writetext1();
				////-------------------
				int z=0;
			    System.out.println("REMINDER: the files need to be here:"+path);
				
				
			       ///-------בחירת משתמש
			        System.out.println("============================================");
			        System.out.println("    What sort would you like to choose?");
			        System.out.println();
			        System.out.println("Press :|1|-for ID,|3|-for TIME,|4|-for LOCATION");
			        System.out.println("============================================");

			        Scanner input=new Scanner(System.in);
			        choose=input.nextInt();
			        if(choose!=1&&choose!=3&&choose!=4) {System.out.println("====ERROR WRONG CHOISE===");failtesting=false;return;}
			        System.out.println("          You choosed : |"+choose+"|");
			        if(choose==1)
			        {
			            System.out.println("============================================");

			        	System.out.println("Write ID name or part of the ID name: (for example:Bezeq) ");
			        	 input=new Scanner(System.in);
			        	 filter1.setId(input.nextLine());
			        	 
			        }
			        if(choose==3)
			        {   System.out.println("============================================");

		        	 System.out.println("First enter the *first* point HOUR:");
		        	 input=new Scanner(System.in);
		        	 filter1.setHours1(input.nextLine());
		        	 System.out.println("First enter the *first* point Mintues:");
		        	 input=new Scanner(System.in);
		        	 filter1.setMinutes1(input.nextLine());
		        	 System.out.println("First enter the *Second* point HOUR:");
		        	 input=new Scanner(System.in);
		        	 filter1.setHours2(input.nextLine());
		        	 System.out.println("First enter the *second* point Mintues:");
		        	 input=new Scanner(System.in);
		        	 filter1.setMinutes2(input.nextLine());
		        	 Wifi check=new Wifi();
		        	 if(!check.isNumeric(filter1.getHours1())) {System.out.println("FAIL CHOISE");failtesting=false;return;}
		        	 if(!check.isNumeric(filter1.getMinutes1())) {System.out.println("FAIL CHOISE");failtesting=false;return;}
		        	 if(!check.isNumeric(filter1.getHours2())) {System.out.println("FAIL CHOISE");failtesting=false;return;}
		        	 if(!check.isNumeric(filter1.getMinutes2())) {System.out.println("FAIL CHOISE");failtesting=false;return;}

			        	 
			        }
			        if(choose==4)
			        {   System.out.println("============================================");

			        	 System.out.println("First enter the *first* point lat:");
			        	 input=new Scanner(System.in);
			        	 filter1.setLat1(input.nextLine());
			        	 System.out.println("First enter the *first* point lot:");
			        	 input=new Scanner(System.in);
			        	 filter1.setLot1(input.nextLine());
			        	 System.out.println("First enter the *second* point lat:");
			        	 input=new Scanner(System.in);
			        	 filter1.setLat2(input.nextLine());
			        	 System.out.println("First enter the *second* point lot:");
			        	 input=new Scanner(System.in);
			        	 filter1.setLot2(input.nextLine());
			        	 Wifi check=new Wifi();
			        	 if(!check.isNumeric(filter1.getLat1())) {System.out.println("FAIL CHOISE");failtesting=false;return;}
			        	 if(!check.isNumeric(filter1.getLot1())) {System.out.println("FAIL CHOISE");failtesting=false;return;}
			        	 if(!check.isNumeric(filter1.getLat2())) {System.out.println("FAIL CHOISE");failtesting=false;return;}
			        	 if(!check.isNumeric(filter1.getLot2())) {System.out.println("FAIL CHOISE");failtesting=false;return;}

			        	 
			        }
			        ////--------הכנת קבצים-----
			        System.out.println("---STARTING PROCCESS-WAIT FOR THE LOADING BAR----");
			        Read readtext1=new Read();
			        readtext1.setCsvfilename("test1");
			        readtext1.convertcsvtotxt();
			        readtext1.setLoc(path+"test1.txt");
			        ArrayList<String> text1csv=readtext1.converttocsv();
			    	////--------
                   
			           
			       
			      ////------יצירת יוניק וויפי-------
			       Writetxt writefiles=new Writetxt();
			      
			        writefiles.setCsv(text1csv);
			        writefiles.WriteUniqWifi();
			       System.out.println("wait...almost done");
			       ////----------------
			       writefiles.WriteOrgnized();
			     
			       ///-----הפעלת פילטר לפי המיון----
			       if(choose==1){filter1.filterID();}
			       if(choose==3){filter1.filterTime();}
			       if(choose==4){filter1.filterLocation();}
			       /////--------יצירת KML-----
			       WriteKml kml=new WriteKml();
			       
			       kml.createkml2();
			       
			       System.out.println("     ==========================");
			       System.out.println("              FINSHED!");
			       System.out.println("     ==========================");

			       
			        
			    } 
		
		
		
		
	}


