package allClass;
import allClass.*;
public class CB extends Players
{
	private int bestDefender;
	
	public CB()
	{
		System.out.print("Defender");
	}
	public CB(String pName,String typleOfPlayer,int hight,int ballControl,int dribbling,int passing,int shooting,int defending,int overAllRating,int attacking,int playedMatch)
	{
		this.pName=pName;
		this.typleOfPlayer=typleOfPlayer;
		this.hight=hight;
		this.ballControl=ballControl;
		this.dribbling=dribbling;
		this.passing=passing;
		this.shooting=shooting;
		this.defending=defending;
		this.overAllRating=overAllRating;
		this.attacking=attacking;
		this.playedMatch=playedMatch;
	}
	public void setBestDefender(int bestDefender)
	{
		this.bestDefender=bestDefender;
	} 
	
	public int getBestDefender()
	{
		return bestDefender;
	}
	
	/*public void BestDefender()
	{
		System.out.println(getBestDefender());
	}*/
	public void states()
	{  
	    System.out.println("------------------");
		System.out.println("States of CB:"+pName);
		System.out.println();
		System.out.println("hight="+hight);
		System.out.println("ball control="+ballControl);
		System.out.println("dribbling="+dribbling);
		System.out.println("passing="+passing);
		System.out.println("Shooting="+shooting);
		System.out.println("defending="+defending);
		System.out.println("overall rating="+overAllRating);
		System.out.println("attacking="+attacking);
		System.out.println("bestDefender:"+bestDefender);
		
		System.out.println();
	}
	public void showDetails()
	{  
	    System.out.println(pName+"=Player name");
     	System.out.println(typleOfPlayer+"=Player Type ");
		System.out.println("hight="+hight);
		System.out.println("ball control="+ballControl);
		System.out.println("dribbling="+dribbling);
		System.out.println("passing="+passing);
		System.out.println("Shooting="+shooting);
		System.out.println("defending="+defending);
		System.out.println("overall rating="+overAllRating);
		System.out.println("attacking="+attacking);
		System.out.println("Played match="+playedMatch);
	}
}