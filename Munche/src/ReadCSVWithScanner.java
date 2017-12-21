

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Wifi.Wifi;

public class ReadCSVWithScanner {

	public static String path=System.getProperty("user.dir")+"\\";
	public String csvpath=System.getProperty("user.dir")+"\\csv\\";
	
	public static void main(String[] args) throws IOException {
		// open file input stream
		BufferedReader reader = new BufferedReader(new FileReader(	path+"check1"+".csv"));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		
		 ArrayList<Wifi>combcsv=new ArrayList<Wifi>();
        int counter=0;
		while ((line = reader.readLine()) != null&&!line.equals("")) 
		{
		    Wifi wifi1=new Wifi();
			String []g=line.split(",");
			int amount=Integer.valueOf(g[5]);
			if(amount!=1)
			{
				
				wifi1.setMac(g[7]);
				wifi1.setSignal(g[9]);
				wifi1.setId(g[6]);
				wifi1.setLat(g[2]);
				wifi1.setLot(g[3]);
				wifi1.sethight(g[4]);
				combcsv.add(counter++,wifi1);
				
				int z=0;
				for(int i=0;i<amount-1;i++)
				{   Wifi wifi2=new Wifi();
					wifi2.setMac(g[11+z]);
					wifi2.setSignal(g[13+z]);
					wifi2.setId(g[10]+z);
					wifi2.setLat(g[2]);
					wifi2.setLot(g[3]);
					wifi2.sethight(g[4]);
					combcsv.add(counter++,wifi2);
					
					z=z+4;
					
				}
				
				z=0;
				
				
				
			}
			
			if(amount==1)
			{
				wifi1.setMac(g[7]);
				wifi1.setSignal(g[9]);
				wifi1.setId(g[6]);
				wifi1.setLat(g[2]);
				wifi1.setLot(g[3]);
				wifi1.sethight(g[4]);
				combcsv.add(counter++,wifi1);
			}
			
			
		}
		
	
		
		reader.close();
		
	}
		
		

}
