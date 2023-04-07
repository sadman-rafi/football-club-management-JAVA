import java.util.*;
import allClass.*;
import Interface.*;
public class Mega
{
	public static void main(String argd[])
	{
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Team t1=new Team(88888888);
		int c6=9;
		while(!(c6==2)){
		try
		{
		Players c0=new GK("rafi","GK",7,34,33,54,22,21,10,25,1);
		Players c10=new MID("p","MID",7,34,33,54,22,21,10,25,1);
		CF c11=new CF("DIP","CF",7,34,33,54,22,21,10,25,1);
		c0.showDetails();		
		CB c1 = new CB("a","CB",6,45,45,34,54,44,34,32,2);
		c1.showDetails();
		c1.setBestDefender(4);
		c1.states();
		Players c2 = new WINGER("b","WINGER",4,55,55,54,24,64,64,64,4);
		// c2.setGoldenBoot(6);
		//c2.setBestWinger(4);
		c2.showDetails();
		//Players p5=new CB("a","CB",6,45,45,34,54,44,34,32,2);
		//Players p6=new CB("b","cb",6,45,45,34,54,44,34,32,2);
		
		
		Players p[]=new Players[2];
		p[0]=c0;
		p[1]=c2;
		t1.insertPlayer(c0);
		t1.insertPlayer(c2);
		t1.showAllPlayer();
		System.out.print("enter player name:");
		String s=sc1.nextLine();
		//t1.getPlayerByPlayerName(s);
		t1.getPlayerByPlayerName(s);
		System.out.print("enter player name for compare:");
		String s1=sc1.nextLine();
		String s2=sc1.nextLine();
		t1.compare(s1,s2);
		System.out.print("enter player type:");
		String t=sc1.nextLine();
		t1.showPlayerByType(t);
		t1.removePlayer(c2);
		t1.insertPlayer(c1);
		t1.showAllPlayer();
		Income i1=new Income();
		System.out.println("Win money:");
		int s3=sc2.nextInt();
		i1.win(s3);
		System.out.println("jersy income:");
		int s4=sc2.nextInt();
		i1.jersyIncome(s4);
		System.out.println("ticket:");
		int s5=sc2.nextInt();
		System.out.println("Maintanance:");
		int s6=sc2.nextInt();
		i1.Stadium(s5,s6);
		System.out.println("player buy:");
		int s7=sc2.nextInt();
		System.out.println("player sell:");
		int s8=sc2.nextInt();
		i1.transfer(s7,s8);
        System.out.println("press any number to back again or press 2 to exit");
		c6=sc2.nextInt();
		
	}
	catch(InputMismatchException ime)
	{
		System.out.println("ERROR");
		System.out.println("Enterd");
		
		c6=sc2.nextInt();
		
	}
	catch(NullPointerException npe)
	{
		System.out.println("ERROR");
		c6=sc2.nextInt();
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("ERROR");
		c6=sc2.nextInt();
	}
		}
	
	}
	}
	