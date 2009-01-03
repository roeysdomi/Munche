import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Sort {
	String fileloc;
	ArrayList<String> csv;
	
	
	
	public ArrayList<String> SortSignal() throws FileNotFoundException
	{

		ArrayList<String>test=csv;
        
      
	     for(int i=0;i<test.size();i++)
	     {
	    	
	    	 String[] words1=test.get(i).split(",");
	    	 int max=Integer.valueOf(words1[5]);
	    	 for(int j=0;j<test.size();j++)
	    	 {   
	    		 String temp=test.get(i);
	    		 String[]words2=test.get(j).split(",");
	    		 int currect=Integer.valueOf(words2[5]);
	    		 

	    		 if(currect>max){test.set(i,test.get(j));test.set(j,temp);max=currect;}
	    	   
	    		 
	    	 }
	    	
	    	 
	     }


	  return test;	
	}



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
