package allClass;

public abstract class Players
{   protected String pName;
	protected String typleOfPlayer;
	protected int hight;
	protected int ballControl;
	protected int dribbling;
	protected int passing;
	protected int shooting;
	protected int defending;
	protected int overAllRating;
	protected int attacking;
	protected int playedMatch;
    

    public void setPName(String pName)
	{
		this.pName=pName;
	}
    public void setTypleOfPlayer(String typleOfPlayer)
	{
		this.typleOfPlayer=typleOfPlayer;
	}
	public void setHight(int hight)
	{
		this.hight=hight;
	}
    public void setBallControl(int ballControl)
	{
		this.ballControl=ballControl;
		
	}
    public void setDribbling(int dribbling)
	{
		this.dribbling=dribbling;
	}	
	public void setPassing(int passing)
	{
		this.passing=passing;
	}
	public void setShooting(int shooting)
	{
		this.shooting=shooting;
	}
	public void setDefending(int defending)
	{
		this.defending=defending;
	}
	public void setOverAllRating(int overAllRating)
	{
		this.overAllRating=overAllRating;
	}
	public void setAttacking(int attacking)
	{
		this.attacking=attacking;
	}
	public void setPlayedMatch(int playedMatch)
	{
		this.playedMatch=playedMatch;
	}
	public String getPName()
	{
		return pName;
	}
	public String getTypleOfPlayer()
	{
		return typleOfPlayer;
	}
	public int getHight()
	{
		return hight;
	}
	public int getBallControl()
	{
		return ballControl;
	}
	public int getDribbling()
	{
		return dribbling;
	}
	public int getPassing()
	{
		return passing;
	}
	public int getShooting()
	{
		return shooting;
	}
	public int getDefending()
	{
		return defending;
	}
	public int getOverAllRating()
	{
		return overAllRating;
	}
	public int getAttacking()
	{
		return attacking;
	}
	public int getPlayedMatch()
	{
		return playedMatch;
	}
	
	public abstract void states();
	public abstract void showDetails();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	