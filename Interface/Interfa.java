package Interface;
import allClass.*;
public interface Interfa
{
	public void insertPlayer(Players x);
	public void removePlayer(Players y);
	public void showAllPlayer();
	public Players getPlayerByPlayerName(String s);
	public void compare(String pn1,String pn2);
}