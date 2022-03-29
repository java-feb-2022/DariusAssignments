package mamals;


public class Gorilla extends Mammal{
		public Gorilla(String name) {
			this.mamalName=name;
			this.energyLevel= 100;
		}
		public void throwItem() {
			System.out.printf("%S throws a coconut \n", this.mamalName);
			this.energyLevel -=5;
		}
		public void eatBananas() {
			System.out.println("Yum yum Gotta love bananas");
			this.energyLevel += 10;
		}
		public void climb() {
			System.out.println("I gotta get to the top of this tree to show my superiority");
			this.energyLevel -= 10;
		}
	}
