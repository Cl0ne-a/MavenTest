import feeder.PetsFeeder;
import petsplace.PetCollector;

public class Main {
	public static void main(String[] args) {
		PetsFeeder feeder = new PetsFeeder();
		feeder.feedMyPets(PetCollector.myHomePets);
	}
}
