
public class WifiForMac {
	////----point1-----
	public String wifinum;
	public String mac;
	public String id;
	public String time;
	public String signal;
	Location loc=new Location();
	///-----point2------
	//public String wifinum2;
	public String mac2;
	public String id2;
	public String time2;
	public String signal2;
	Location loc2=new Location();
	///-----point3------
	//public String wifinum3;
	public String mac3;
	public String id3;
	public String time3;
	public String signal3;
	Location loc3=new Location();
	
   
	/////---------Junit helper----
	public static Boolean failtesting=true;
	////---------wifi :that create object check contant and comprator ----
	public WifiForMac()
	{}
	public void WifiMac(String g)
	{   if(!g.equals("1"))
		{
		String []words=g.split(",");
		int size=Integer.valueOf(words[0]);
		size=size*7;
		this.wifinum=words[0];
	    for(int i=0;i<size;i=i+7)
	    {
	    	if(i==0)
	    	{	
			this.mac=words[1+i];
			this.id=words[2+i];
			this.time=words[3+i];
			this.signal=words[4+i];
			this.loc.lat=(words[5+i]);		
			this.loc.lot=(words[6+i]);
			this.loc.hight=(words[7+i]);
	    	}
	    	if(i==7)
	    	{	
			this.mac2=words[1+i];
			this.id2=words[2+i];
			this.time2=words[3+i];
			this.signal2=words[4+i];
			this.loc2.lat=(words[5+i]);		
			this.loc2.lot=(words[6+i]);
			this.loc2.hight=(words[7+i]);
	    	}
	    	if(i==14)
	    	{	
			this.mac3=words[1+i];
			this.id3=words[2+i];
			this.time3=words[3+i];
			this.signal3=words[4+i];
			this.loc3.lat=(words[5+i]);		
			this.loc3.lot=(words[6+i]);
			this.loc3.hight=(words[7+i]);
	    	}
	    }
		//if(!isNumeric(signal)) {failtesting=false;System.out.println("Error Signal look :"+signal);return;}
		//if(!isDate(time)) {{failtesting=false;System.out.println("Error time look :"+time);return;}}
		//if(!isNumeric(loc.getLat())) {failtesting=false;System.out.println("Error Lat look :"+loc.getLat());return;}
		//if(!isNumeric(loc.getLot())) {failtesting=false;System.out.println("Error Lot look :"+loc.getLot());return;}
		//if(!isNumeric(loc.getHight())) {failtesting=false;System.out.println("Error hight look :"+loc.getHight());return;}
		}
	}
	

}
