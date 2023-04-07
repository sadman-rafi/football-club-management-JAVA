package allClass;
import allClass.*;
public class GK extends Players
{  
    private int goldenGlaves;
	
	public GK()
	{
		System.out.print("Goal Keeper");
	}
	public GK(String pName,String typleOfPlayer,int hight,int ballControl,int dribbling,int passing,int shooting,int defending,int overAllRating,int attacking,int playedMatch)
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
	
	public void setGoldenGlaves(int goldenGlaves)
	{
		this.goldenGlaves=goldenGlaves;
	}
	
	public int getGoldenGlaves()
	{
		return goldenGlaves;
	}
	
	/*public void GoldenGlaves()
	{
		System.out.println(getGoldenGlaves());
	}
		*/
		
	 
	public void states()
	{   
		System.out.println("------------------");
		System.out.println("States of GK:"+pName);
		System.out.println();
	    System.out.println("hight="+hight);
		System.out.println("ball control="+ballControl);
		System.out.println("dribbling="+dribbling);
		System.out.println("passing="+passing);
		System.out.println("Shooting="+shooting);
		System.out.println("defending="+defending);
		System.out.println("overall rating="+overAllRating);
		System.out.println("attacking="+attacking);
		System.out.println("goldenGlaves:"+goldenGlaves);	
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
		
		
		
		
		
		
		
		
		
		