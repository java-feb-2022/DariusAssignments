package mamals;

public class Mammal{
	public int energyLevel = 100;
	public String mamalName;
	public int displayEnergy() {
		System.out.printf("%S 's Energy Level is: %d \n",mamalName,energyLevel);
		return energyLevel;
	}
}
