
public abstract class NormalLoc extends Location{

	NormalLoc(Player player,String name) {
		super(player, name);
		this.name = name;
	}
	

	public boolean getLocation() {
		return true;
	}
	
	
}