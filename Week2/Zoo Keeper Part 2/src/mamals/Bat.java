package mamals;

public class Bat extends Mammal{
		public Bat(String name) {
			this.mamalName = name;
			this.energyLevel=300;
		}
		public void fly() {
			System.out.println("FLAP FLAP FLAP");
			this.energyLevel-=50;
		}
		public void eatHuman() {
			System.out.println("Another day another human");
			this.energyLevel+=25;
		}
		public void attackTown() {
			System.out.println("This town looks better on fire");
			this.energyLevel-=100;
		}
		
}
