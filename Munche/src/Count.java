import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Count {
	
String loc;
ArrayList<String> csv;





public int countrows() throws FileNotFoundException
{
 int z=0;
 File file1=new File(loc);
 Scanner sc =new Scanner(file1);
 ///---------------------
 while(sc.hasNextLine())
 {z++;sc.nextLine();}
 return z;
}
public int countrowsCSV() throws FileNotFoundException
{
 int z=0;
 ArrayList<String> temp=csv;
 ///---------------------
 z=temp.size();
 System.out.println(z);
 return z;
}





public String getLoc() {
	return loc;
}





public void setLoc(String loc) {
	this.loc = loc;
}
public ArrayList<String> getCsv() {
	return csv;
}
public void setCsv(ArrayList<String> csv) {
	this.csv = csv;
}

}
