import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;


public class test {

	
	
	
	public static void main(String[]args) throws IOException
	{
		/////-----מפה מריצים------
	
		System.out.println("star");
        Wifi wifi1=new Wifi();
        wifi1.setLat("32.103");
        wifi1.setLot("35.208");
        wifi1.sethight("650");
        wifi1.setSignal("-30");
        wifi1.setMac("5:fd:45");
        
        Wifi wifi2=new Wifi();
        wifi2.setLat("32.105");
        wifi2.setLot("35.205");
        wifi2.sethight("660");
        wifi2.setSignal("-80");
        wifi2.setMac("5:fd:45");

        Wifi wifi3=new Wifi();
        wifi3.setLat("32.103");
        wifi3.setLot("35.307");
        wifi3.sethight("680");
        wifi3.setSignal("-90");
        wifi3.setMac("5:fd:45");

        
        ArrayList<Wifi> check=new ArrayList<>();
        
        check.add(0,wifi1);
        check.add(1,wifi2);
        check.add(2,wifi3);
        Start ch=new Start();
        ch.choose=6;
        WriteTxt3 run=new WriteTxt3();
      //  run.ListLiner=new ArrayList<>(check);
        run.WriteMacalgo();
		//Start run=new Start();
		//run.Start();
		//Wifi wifi=new Wifi();
		//wifi.setLat("34");
		//System.out.println(wifi.getLat());
	   
	}
	
	
	
	
}
