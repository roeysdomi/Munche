import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Sort {
	String fileloc;
	ArrayList<String> csv;
	
	////----------sort function--------
	/**
	 * 
	 * @return 
	 * @throws FileNotFoundException
	 */
	public ArrayList<String> SortSignal() throws FileNotFoundException
	{

		ArrayList<String>test=csv;
        
      
	     for(int i=0;i<test.size();i++)
	     {
	    	 Wifi wifi1=new Wifi(test.get(i));
	    	 int max=Integer.valueOf(wifi1.getSignal());
	    	 for(int j=0;j<test.size();j++)
	    	 {   Wifi wifi2=new Wifi(test.get(j));
	    		 String temp=test.get(i);
	    		 int currect=Integer.valueOf(wifi2.getSignal());
	    		 

	    		 if(currect<max){test.set(i,test.get(j));test.set(j,temp);max=currect;}
	    	   
	    		 
	    	 }
	    	
	    	 
	     }


	  return test;	
	}


//--------set and get---------
	public String getFileloc() {
		return fileloc;
	}



	public void setFileloc(String fileloc) {
		this.fileloc = fileloc;
	}



	public ArrayList<String> getCsv() {
		return csv;
	}



	public void setCsv(ArrayList<String> csv) {
		this.csv = csv;
	}

	
}
