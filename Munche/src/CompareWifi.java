import java.util.ArrayList;

public class CompareWifi {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	public ArrayList<Wifi> listcomp;
	
	
	
	
	
	public CompareWifi(ArrayList<Wifi> example)
	{
		this.listcomp=new ArrayList<>(example);
	}
	public boolean IDComperator(int i,int z)
	{ 
	  
	  if(
	     listcomp.get(i).getId().equals(listcomp.get(z).getId())
	    
	    )
	  {return true;}
	  else 
		  return false;
	
	 	
	}
	public boolean TimeComperator(int i,int z)
	{ 
	  
	  if(
	     listcomp.get(i).getTime().equals(listcomp.get(z).getTime())
	    
	    )
	  {return true;}
	  else 
		  return false;
	 	
	}
	public boolean LocComperator(int i,int z)
	{ 
	  
	  if(
	     listcomp.get(i).getLat().equals(listcomp.get(z).getLat())&&
	     listcomp.get(i).getLot().equals(listcomp.get(z).getLot())&&
	     listcomp.get(i).getHight().equals(listcomp.get(z).getHight())
	    
	    )
	  {return true;}
	  else 
		  return false;
	 	
	}
	
	public boolean MacComperator(int i,int z)
	{ 
	  
	  if(
	     listcomp.get(i).getMac().equals(listcomp.get(z).getMac())
	     
	    
	    )
	  {return true;}
	  else 
		  return false;
	 	
	}
	public boolean AllComperator(int i,int z)
	{ 
	  
	  if(    listcomp.get(i).getId().equals(listcomp.get(z).getId())&& 
			  listcomp.get(i).getTime().equals(listcomp.get(z).getTime())&&
			 listcomp.get(i).getLat().equals(listcomp.get(z).getLat())&&
			     listcomp.get(i).getLot().equals(listcomp.get(z).getLot())&&
			     listcomp.get(i).getHight().equals(listcomp.get(z).getHight())
	    )
	  {return true;}
	  else 
		  return false;
	 	
	
	}
}
