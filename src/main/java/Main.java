import petsplace.PetCollector;

public class Main {
	public static void main(String[] args) {
		PetCollector.myHomePets.forEach(pet ->
				System.out.println(
						pet.getName() + " " +
						pet.getType() + " " +
						pet.getClass()));
	}
}
