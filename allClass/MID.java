package allClass;
import allClass.*;
public class MID extends Players
{   
    private int bestMidFielder;
	
	public MID()
	{
		System.out.print("Midfielder");
	}
	public MID(String pName,String typleOfPlayer,int hight,int ballControl,int dribbling,int passing,int shooting,int defending,int overAllRating,int attacking,int playedMatch)
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
	public void setBestMidFielder(int bestMidFielder)
	{
		this.bestMidFielder=bestMidFielder;
	} 
	
	public int getBestMidFielder()
	{
		return bestMidFielder;
	}
	
	/*public void BestMidFielder()
	{
		System.out.println(getBestMidFielder());
	} */
	public void states()
	{  
		System.out.println("------------------");
		System.out.println("States of MID:"+pName);
		System.out.println();
		System.out.println("hight="+hight);
		System.out.println("ball control="+ballControl);
		System.out.println("dribbling="+dribbling);
		System.out.println("passing="+passing);
		System.out.println("Shooting="+shooting);
		System.out.println("defending="+defending);
		System.out.println("overall rating="+overAllRating);
		System.out.println("attacking="+attacking);
		System.out.println("bestMidFielder:"+bestMidFielder);
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