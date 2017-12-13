package Algorithems;
import Wifi.Wifi;

public class Calculate2 {
	final int power=2;
	final int norm=10000;
   	final double sigdiff=0.4;
	final int mindiff=3;
	final int diffnosig=100;
	/////------
	int sig;
	int diff;
	double w;
	double pi;
	int input;
	public Calculate2(int sig ,int input)
	{
		//sig=Integer.valueOf(wifi1.getSignal());
		  if(sig==-120) {diff=100;}
		  if(sig!=-120)
		  {
		  int hefresh=Math.abs((input-sig));
		  int max= Math.max(hefresh, mindiff);
		  this.diff=max;
	      }
		  double firstpower=Math.pow(diff, sigdiff);
		  double secondpower=Math.pow(input, power);
		  this.w=norm/(firstpower*secondpower);
		  System.out.println("this is w:"+w+"|this is diff"+diff);
	}
	
	public void create_w(Wifi wifi1,Wifi wifi2,Wifi wifi3)
	{
	   
	}
	public static void main  (String []args)
	{
		Calculate roey =new Calculate(-120, -50);
	}
	
}
