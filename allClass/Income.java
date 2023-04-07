package allClass;
public class Income
{
	public int WinMoney;
	public int matchWin;
	public int jersy;
	public int numOfJersy;
	public int playerTransfer;
	public int stadium;
	public int ticket;
	public int numOfticket;
	public int maintainance;
	public int Sincome;
	public int totalIncome;
	  
	public void win(int i)
	{  
     	WinMoney=1000000;
		matchWin=i;
		WinMoney=matchWin*WinMoney;
		System.out.print(+WinMoney);
	}
	public void jersyIncome(int p)
	{    
	    jersy=1000;
		numOfJersy=p;
		jersy=numOfJersy*jersy;
		System.out.print(+jersy);
	}
	public void Stadium(int t,int r)
	{
		ticket=1000;
		numOfticket=t;
		maintainance=r;
		ticket=numOfticket*ticket;
		Sincome=ticket-maintainance;
		System.out.print(+Sincome);
	}
	public void transfer(int o,int q)
	{
		playerTransfer=q-o;
		System.out.print(+playerTransfer);
	}
	
	
	
}
		
		
		
		