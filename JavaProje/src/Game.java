import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scanner = new Scanner(System.in);

	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Macera Oyununa Hoşgeldiniz !");
		System.out.println("Oyuna başlamadan önce isminizi giriniz : ");
		String playerName = scan.nextLine();
		player = new Player(playerName);
		player.selectChar();
		start();
	}

	public void start() {
		while(true) {
			System.out.println();
			System.out.println("========================================================");
			System.out.println();
			System.out.println("Eylem gerçekleştirmek için bir yer seçiniz(1 ile 5 arsında sayı giriniz !) : ");
			System.out.println("1- Güvenli Ev\t ==>\t Size ait güvenli bir mekan, düşman yok ");
			System.out.println("2- Mağara\t  ==>\t Karşınıza belki zombi çıkabilir !");
			System.out.println("3- Orman \t   ==>\t Karşınıza belki vampir çıkabilir ! ");
			System.out.println("4- Nehir \t   ==>\t Karşınıza belki ayı çıkabilir ! ");
			System.out.println("5- Mağaza\t  ==>\t Silah veya zırh alabilirsiniz ");
			System.out.print("Gitmek istediğniz yer : ");
			int selectLoc = scanner.nextInt();
			while (selectLoc < 0 || selectLoc > 5) {
				System.out.print("Lütfen geçerli bir yer seçiniz : ");
				selectLoc = scanner.nextInt();
			}
			switch (selectLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new ToolStore(player) {
					
				};
				break;
				default : 
					location = new SafeHouse(player);
					break;
			}
			if(location.getClass().getName().equals("SafeHouse")) {
				if(player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()) {
					System.out.println("Oyunu Kazandınız !");
					break;
				}
			}
			if(!location.getLocation()) {
				System.out.println("Oyun Bitti..");
				break;
			}

		}
	}

}
