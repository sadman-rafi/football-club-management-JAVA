package allClass;
import allClass.*;
import Interface.*;
public class Team implements Interfa
{   
    private Income i;
	Players p[];
	public static int numberOfPlayers=0; 
	
	public Team()
	{
		
	}
	
	public Team(int pNum)
	{
		p=new Players[pNum];
		
	}
	public void insertPlayer(Players x)
	{
		
		for(int i=0; i<p.length; i++)
		{
			if(p[i] == null)
			{
				p[i] = x;
				break;
			}
			numberOfPlayers++;
		}
		
	}
	public void removePlayer(Players y)
	{
		for(int i=0; i<p.length; i++)
		{
			if(p[i] == y)
			{
				p[i] = null;
				
				break;
			}
			numberOfPlayers--;
		}
		
	}
	public void showAllPlayer()	
	{
		for(int i=0; i<p.length; i++)
		{
			if(p[i] != null)
			{
				System.out.println("-----------------------");
				p[i].showDetails();
				System.out.println();
			}
		}
	}
	
	public Players getPlayerByPlayerName(String s)
	{   int flag=0;
	    Players p3=null;
		for(int i=0; i<p.length; i++)
		{
			if(p[i] != null)
			{
			if(p[i].getPName().equals(s))
			{
			  p3=p[i];
			  flag=1;
               break;
        			   
			}
			
			}
		}
		if(flag==1){System.out.println("found");}
			else{System.out.println("not found");}
		return p3;
		
	} 
	
	public void compare(String pn1,String pn2)
	{
		
			Players p1=getPlayerByPlayerName(pn1);
			Players p2=getPlayerByPlayerName(pn2);
			System.out.println("overAllRating");
			System.out.print(p1.overAllRating+",");
			System.out.print(p2.overAllRating+",");
		if(p1.overAllRating>p2.overAllRating)
		{
			System.out.println("(*"+p1.overAllRating+")");
		}
		else
		{
			System.out.println("(*"+p2.overAllRating+")");
		}
		System.out.println("ballControl");
		System.out.print(p1.ballControl+",");
		System.out.print(p2.ballControl+",");
		if(p1.ballControl>p2.ballControl)
		{
			System.out.println("(*"+p1.ballControl+")");
		}
		else
		{
			System.out.println("(*"+p2.ballControl+")");
		}
		System.out.println("dribbling");
		System.out.print(p1.dribbling+",");
		System.out.print(p2.dribbling+",");
		if(p1.dribbling>p2.dribbling)
		{
			System.out.println("(*"+p1.dribbling+")");
		}
		else
		{
			System.out.println("(*"+p2.dribbling+")");
		}
		System.out.println("passing");
		System.out.print(p1.passing+",");
		System.out.print(p2.passing+",");
		if(p1.passing>p2.passing)
		{
			System.out.println("(*"+p1.passing+")");
		}
		else
		{
			System.out.println("(*"+p2.passing+")");
		}
		System.out.println("shooting");
		System.out.print(p1.shooting+",");
		System.out.print(p2.shooting+",");
		if(p1.shooting>p2.shooting)
		{
			System.out.println("(*"+p1.shooting+")");
		}
		else
		{
			System.out.println(p2.shooting);
		}
		System.out.println("defending");
		System.out.print(p1.defending+",");
		System.out.print(p2.defending+",");
		if(p1.defending>p2.defending)
		{
			System.out.println("(*"+p1.defending+")");
		}
		else
		{
			System.out.println("(*"+p2.defending+")");
		}
		System.out.print("attacking");
		System.out.print(p1.attacking+",");
		System.out.print(p2.attacking+",");
		if(p1.attacking>p2.attacking)
		{
			System.out.println("(*"+p1.attacking+")");
		}
		else
		{
			System.out.println("(*"+p2.attacking+")");
		}		
			
	}

 
	
public void showPlayerByType(String t) 
	{
		int flag =0;
		for(int i=0; i<p.length; i++)
		{			
			if(p[i] != null)
			{
				if(p[i].getTypleOfPlayer().equals(t))
			   {
				//System.out.println(+(i+1)+"--------------");
				System.out.println();
				p[i].showDetails();
				System.out.println();
				flag = 1;
			   }
			}
		}
		if(flag==0){System.out.println("no");}
	}
	}
		
	
	
	
	
	
	
	
	
	