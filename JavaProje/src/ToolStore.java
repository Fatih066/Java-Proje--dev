import java.util.Scanner;

public abstract class ToolStore extends NormalLoc{

	Scanner scanner =new Scanner(System.in);
	ToolStore(Player player) {
		super(player, "Mağaza");
	}

	public boolean getLocation() {
		System.out.println("Para : " + player.getMoney());
		System.out.println("1. Silahlar");
		System.out.println("2. Zırhlar");
		System.out.println("3. Çıkış");
		System.out.print("Seçiminiz : ");
		int selTool = scan.nextInt();
		int selItemID;
		switch (selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2:
			selItemID = armorMenu(); 
			buyArmor(selItemID);
		default:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		}

		return true;
	}
	public int armorMenu() {
		System.out.println("1- Hafif \t <Para : 15 \tEngelleme : 1>" );
		System.out.println("2- Orta \t <Para : 25 \tEngelleme : 3>" );
		System.out.println("3- Ağır \t <Para : 40 \tEngelleme : 5>" );
		System.out.println("4- Çıkış ");
		System.out.print("Silah Seçiniz : ");
		
		int selArmorID = scanner.nextInt();
		return selArmorID; 
	}
	public void buyArmor(int itemID) {
		int avoid = 0, price = 0;
		 String aName = null;
		 switch(itemID) {
		 case 1:
			 avoid = 1;
			 aName = "Hafif";
			 price = 15;
			 break;
		 case 2:
			 avoid = 3;
			 aName = "Orta";
			 price = 25;
			 break;
		 case 3:
			 avoid = 5;
			 aName = "Ağır";
			 price = 40;
			 break;
		 case 4:
			 System.out.println("Çıkış Yapılıyor...");
			 break;
			 default :
				 System.out.println("Geçersiz İşlem !");
				 break;
		 }
		 if(price > 0) {
		if(player.getMoney() >= price) {
			player.getInventory().setArmor(avoid);
			player.getInventory().setaName(aName);
			player.setMoney(player.getMoney()-price);
			System.out.println(aName+" Zırh satın aldınız, Engellenen Hasar : "+player.getInventory().getArmor()); 
			System.out.println("==============================================================");
					
		}else {
			System.out.println("Bakiye Yetersiz !");
		}
		 }
	}
	public int weaponMenu() {
		System.out.println("1- Tabanca\t <Para : 25 \tHasar : 2>" );
		System.out.println("2- Kılıç\t <Para : 35 \tHasar : 3>" );
		System.out.println("3- Tüfek\t <Para : 45 \tHasar : 7>" );
		System.out.println("4- Çıkış ");
		System.out.print("Silah Seçiniz : ");
		
		int selWeaponID = scanner.nextInt();
		return selWeaponID;
	}
	public void buyWeapon(int itemID) {
		 int damage = 0, price = 0;
		 String wName = null;
		 switch(itemID) {
		 case 1:
			 damage = 2;
			 wName = "Tabanca";
			 price = 25;
			 break;
		 case 2:
			 damage = 3;
			 wName = "Kılıç";
			 price = 35;
			 break;
		 case 3:
			 damage = 7;
			 wName = "Tüfek";
			 price = 45;
			 break;
		 case 4:
			 System.out.println("Çıkış Yapılıyor...");
			 break;
			 default :
				 System.out.println("Geçersiz İşlem !");
				 break;
		 }
		 if(price > 0) {
		if(player.getMoney() >= price) {
			player.getInventory().setDamage(damage);;
			player.getInventory().setwName(wName);
			player.setMoney(player.getMoney()-price);
			System.out.println(wName+" satın aldınız, Önceki Hasar : "+player.getDamage()+",Yeni Hasar : "
					+player.getTotalDamage()); 
					
		}else {
			System.out.println("Bakiye Yetersiz !");
		}
		 }
		
	}
	
	
	
	
	
	
}
