package zookeeper;
import mamals.Bat;
import mamals.Gorilla;
import mamals.Mammal;
public class ZooKeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla george = new Gorilla("George");
		george.displayEnergy();
		george.throwItem();
		george.throwItem();
		george.throwItem();
		george.displayEnergy();
		george.eatBananas();
		george.eatBananas();
		george.displayEnergy();
		george.climb();
		george.displayEnergy();
		
		Bat vlad = new Bat("Vlad");
		vlad.displayEnergy();
		vlad.attackTown();
		vlad.attackTown();
		vlad.attackTown();
		vlad.displayEnergy();
		vlad.eatHuman();
		vlad.eatHuman();
		vlad.displayEnergy();
		vlad.fly();
		vlad.fly();
		vlad.displayEnergy();
	}

}
