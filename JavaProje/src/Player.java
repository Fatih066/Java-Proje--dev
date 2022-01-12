import java.util.Scanner;

public class Player {
	
	private int damage, healthy, money, rHealthy;
	private String pName, cName;
	private Inventory inventory;
	Scanner scanner = new Scanner(System.in);
	public void selectChar() {
		switch(charMenu()) {
		case 1 :
			initPlayer("Samuray", 5, 21, 15);
			break;
		case 2 :
			initPlayer("Ok�u", 7, 18, 20);
			break;
		case 3 : 
			initPlayer("��valye", 8, 24, 5);
			break;
			default :
				
				
			
	}
		System.out.println("Se�ilen Karakter : "+ "�sim : " +getcName() + "\t"+"Hasar : "+getDamage() + "\t"+"Can : " +getHealthy()+"\t"+"Para : "+getMoney());
	}
	public int charMenu() {
		System.out.println("L�tfen bir karakter se�iniz : ");
		System.out.println("1- Samuray \t => \t Hasar : 5 \t Sa�l�k : 21 \t Para : 15");
		System.out.println("2- Ok�u \t => \t Hasar : 7 \t Sa�l�k : 18 \t Para : 20");
		System.out.println("3- ��valye \t => \t Hasar : 8 \t Sa�l�k : 24 \t Para : 5");
		System.out.println("Karakter ID'nizi giriniz : ");
		int charID = scanner.nextInt();
		while(charID < 1 || charID > 3) {
			System.out.println("L�tfen ge�erli bir say� giriniz : ");
			charID = scanner.nextInt();
		}
		return charID;
				
	}
	public int getTotalDamage() {
		return this.getDamage() + this.getInventory().getDamage(); 
	}
	public void initPlayer(String cName, int dmg, int hlthy, int mny) {
		setcName(cName);
		setDamage(dmg);
		setHealthy(hlthy);
		setMoney(mny);
		setrHealthy(hlthy);
		
	}
	public Player(String pName) {
		this.pName = pName;
		this.inventory = new Inventory(); 
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealthy() {
		return healthy;
	}
	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public int getrHealthy() {
		return rHealthy;
	}
	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	
	
	

}
