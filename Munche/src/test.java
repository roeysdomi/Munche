import java.io.IOException;
import java.util.ArrayList;


public class test {

	
	
	
	public static void main(String[]args) throws IOException
	{
		
		//Start run=new Start();
		//run.Start();
		test ri=new test();
		System.out.println(ri.isNumeric("34.534"));
		
		//System.out.println(text1csv);
		//Writetxt run=new Writetxt();
		//run.Writetext1();
	   
	}
	
	
	
	public boolean isNumeric(String s) 
	{  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	   
	}  
}
