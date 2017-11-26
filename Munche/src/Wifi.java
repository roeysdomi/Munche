
public class Wifi {
	public String wifinum;
	public String mac;
	public String id;
	public String time;
	public String signal;
	public String lot;
	public String lat;
	public String hight;
	/////---------Junit helper----
	public static Boolean failtesting=true;
	////---------wifi :that create object check contant and comprator ----
	public Wifi()
	{
		
	}
	public Wifi(String g)
	{   if(!g.equals("1"))
		{
		String []words=g.split(",");
		if(words.length<9) {failtesting=false;}
		
		this.mac=words[0];
		this.id=words[1];
		this.time=words[3];
		this.signal=words[5];
		this.lat=(words[6]);		
		this.lot=(words[7]);
		this.hight=(words[8]);	
		
		if(!isNumeric(lat)) {failtesting=false;System.out.println(lat);return;}
		if(!isNumeric(lot)) {failtesting=false;System.out.println(lot);return;}
		if(!isNumeric(hight)) {failtesting=false;System.out.println(hight);return;}

		}
	}
	public void Wififilterd(String g)
	{   if(!g.equals("1"))
		{
		String []words=g.split(",");
		if(words.length<7) {failtesting=false;}
		this.mac=words[0];
		this.id=words[1];
		this.time=words[2];
		this.signal=words[3];
		this.lat=(words[4]);		
		this.lot=(words[5]);
		this.hight=(words[6]);	
		
		if(!isNumeric(lat)) {failtesting=false;System.out.println(lat);return;}
		if(!isNumeric(lot)) {failtesting=false;System.out.println(lot);return;}
		if(!isNumeric(hight)) {failtesting=false;System.out.println(hight);return;}
		}
	}
	public void Wifiorgenized(String g)
	{   if(!g.equals("1"))
		{
		String []words=g.split(",");
		if(words.length<7) {failtesting=false;}
		this.mac=words[1];
		this.id=words[2];
		this.time=words[3];
		this.signal=words[4];
		this.lat=(words[5]);		
		this.lot=(words[6]);
		this.hight=(words[7]);	
		
		if(!isNumeric(lat)) {failtesting=false;System.out.println(lat);return;}
		if(!isNumeric(lot)) {failtesting=false;System.out.println(lot);return;}
		if(!isNumeric(hight)) {failtesting=false;System.out.println(hight);return;}
		}
	}
	public boolean Comperator(String wifi1,String wifi2)
	{ 
	  
	  if(wifi1.equals(wifi2)){return true;}
	  else 
		  return false;
	
	 	
	}
	public boolean isNumeric(String s) 
	{  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	   
	}  
/////---------get and set------------
	public String getWifinum() {
		return wifinum;
	}


	public void setWifinum(String wifinum) {
		this.wifinum = wifinum;
	}


	public String getMac() {
		return mac;
	}


	public void setMac(String mac) {
		this.mac = mac;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getSignal() {
		return signal;
	}


	public void setSignal(String signal) {
		this.signal = signal;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getHight() {
		return hight;
	}
	public void setHight(String hight) {
		this.hight = hight;
	}


	

}
