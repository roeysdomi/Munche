import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Junit_CheckContant2 {
	String path=System.getProperty("user.dir")+"\\";
	String csvpath=System.getProperty("user.dir")+"\\csv\\";
	
	
	
	
	
	
	/////-----class Writetxt------
	@Test
	void test_writeUniqWifi() throws IOException {
		///-----read from 
		Read read1=new Read();
	     read1.setLoc(path+"unicwifi.txt");
	     ArrayList<String> csv=read1.converttocsv();
	     ///-----lunch-----
		Writetxt test=new Writetxt();
		test.setCsv(csv);
		test.WriteUniqWifi();
		
		Wifi check=new Wifi();
		assumeTrue(check.failtesting);
		check.setFailtesting(true);
	}
	@Test
	void test_writefixmac() throws IOException {
		Read read1=new Read();
	     read1.setLoc(path+"unicwifi.txt");
	     ArrayList<String> csv=read1.converttocsv();
	     
		Writetxt test=new Writetxt();
		test.setCsv(csv);
		test.Writefixmac();
		Wifi check=new Wifi();
		assumeTrue(check.failtesting);
		check.setFailtesting(true);
	}

	@Test
	void test_writewifiliner() throws IOException {
		Writetxt test=new Writetxt();
		Read read1=new Read();
	     read1.setLoc(path+"unicwifi.txt");
	     ArrayList<String> csv=read1.converttocsv();
		
		test.Writewifi_liner(csv, 1);
		
		Wifi check=new Wifi();
		assumeTrue(check.failtesting);
		check.setFailtesting(true);
	}
	@Test
	void test_writeorgnized() throws IOException {
		Writetxt test=new Writetxt();
		test.WriteOrgnized();
		Wifi check=new Wifi();
		assumeTrue(check.failtesting);
		check.setFailtesting(true);
	}
/////--------writekml------------
	@Test
	void test_createkml2() throws IOException {
		WriteKml test=new WriteKml();
		test.createkml2();
		
		Wifi check=new Wifi();
		assumeTrue(check.failtesting);
		check.setFailtesting(true);
	}
/////--------Filter------------
	@Test
	void test_Filter() throws IOException {
		Filter test=new Filter();
		test.setId("Bezeq");
		test.filterID();
		
		Wifi check=new Wifi();
		assumeTrue(check.failtesting);
		check.setFailtesting(true);
	}
	
}
