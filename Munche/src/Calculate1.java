import java.util.ArrayList;

public class Calculate1 {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	public ArrayList<Wifi> enterlist;
	public ArrayList<CompareWifi2> weightlist;
	public ArrayList<CompareWifi2> result;
	


public Calculate1( ArrayList<Wifi> list)
	{
		this.enterlist=new ArrayList<>(list);
		this.weightlist=new ArrayList<>();
		this.result=new ArrayList<>();
	}
public void runCalculate1( )
{
	Creatweightlist();
	createresult();
}

public void Creatweightlist()
{
	for (int i=0;i<enterlist.size();i++)
	{
		double Signal=Double.valueOf(enterlist.get(i).getSignal());
		double lat=Double.valueOf(enterlist.get(i).getLat());
		double lot=Double.valueOf(enterlist.get(i).getLot());
		double hight=Double.valueOf(enterlist.get(i).getHight());
		double weight=1/(Signal*Signal);
	    //----------create weight list------
		double newlat=lat*weight;
		double newlot=lot*weight;
		double newhight=hight*weight;
		
		CompareWifi2 com=new CompareWifi2();
		com.setLat(newlat);
		com.setLot(newlot);
		com.setHight(newhight);
		com.setWeight(weight);
		com.setMac(enterlist.get(i).getMac());
		weightlist.add(i,com);
	}
}
public void createresult()
{    double sumlat=0;
     double sumlot=0;
     double sumhight=0;
     double sumweight=0;
     
	for(int i=0;i<weightlist.size();i++)
	{
		
		 sumlat=sumlat+weightlist.get(i).getLat();
		 sumlot=sumlot+weightlist.get(i).getLot();
		 sumhight=sumhight+weightlist.get(i).getHight();
		 sumweight=sumweight+weightlist.get(i).getWeight();
	}
	CompareWifi2 com=new CompareWifi2();
	double finallat=sumlat/sumweight;
	double finallot=sumlot/sumweight;
	double finalhight=sumhight/sumweight;
	
	com.setLat(finallat);
	com.setLot(finallot);
	com.setHight(finalhight);
	com.setWeight(sumweight);
	com.setMac(enterlist.get(0).getMac());
	result.add(0,com);
}
	




}