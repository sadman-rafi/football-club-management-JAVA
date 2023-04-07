package allClass;
import allClass.*;
public class WINGER extends Players
{  
    private int goldenBoot;
	private int bestWINGER;

	public WINGER()
	{
		System.out.print("Winger");
	}
	public WINGER(String pName,String typleOfPlayer,int hight,int ballControl,int dribbling,int passing,int shooting,int defending,int overAllRating,int attacking,int playedMatch)
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
	public void setBestWinger(int bestWINGER)
	{
		this.bestWINGER=bestWINGER;
	} 
	public void setGoldenBoot(int goldenBoot)
	{
		this.goldenBoot=goldenBoot;
	} 
	
	public int getBestWinger()
	{
		return bestWINGER;
	}
	
	public int getGoldenBoot()
	{
		return goldenBoot;
	}
	
	public void states()
	{   System.out.println("------------------");
		System.out.println("States of WINGER:"+pName);
		System.out.println();
		System.out.println("hight="+hight);
		System.out.println("ball control="+ballControl);
		System.out.println("dribbling="+dribbling);
		System.out.println("passing="+passing);
		System.out.println("Shooting="+shooting);
		System.out.println("defending="+defending);
		System.out.println("overall rating="+overAllRating);
		System.out.println("attacking="+attacking);
		System.out.println("goldenBoot:"+goldenBoot);
		System.out.println("bestWINGER:"+bestWINGER);
		
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