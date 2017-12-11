
public class WifiForMac {
	public String wifinum;
	public String mac;
	public String id;
	public String time;
	public String signal;
	Location loc=new Location();
	
   
	/////---------Junit helper----
	public static Boolean failtesting=true;
	////---------wifi :that create object check contant and comprator ----
	public WifiForMac()
	{}
	public void WifiMac(String g)
	{   if(!g.equals("1"))
		{
		String []words=g.split(",");
		if(words.length<7) {failtesting=false;System.out.println("contant error");}
		this.mac=words[1];
		this.id=words[2];
		this.time=words[3];
		this.signal=words[4];
		this.loc.lat=(words[5]);		
		this.loc.lot=(words[6]);
		this.loc.hight=(words[7]);	
		if(!isNumeric(signal)) {failtesting=false;System.out.println("Error Signal look :"+signal);return;}
		if(!isDate(time)) {{failtesting=false;System.out.println("Error time look :"+time);return;}}
		if(!isNumeric(loc.getLat())) {failtesting=false;System.out.println("Error Lat look :"+loc.getLat());return;}
		if(!isNumeric(loc.getLot())) {failtesting=false;System.out.println("Error Lot look :"+loc.getLot());return;}
		if(!isNumeric(loc.getHight())) {failtesting=false;System.out.println("Error hight look :"+loc.getHight());return;}
		}
	}
	

}
