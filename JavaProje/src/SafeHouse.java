
public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}

	public boolean getLocation() {  
		player.setHealthy(player.getrHealthy());
		System.out.println("Canýnýz yenilendi.. ");
		System.out.println("Þuan güvenli evdesiniz ");
		return true;
	}

}
