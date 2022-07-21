package feeder;

import homies.abstraction.Pet;
import homies.impl.Cat;

import java.util.Collection;

public class PetsFeeder {
	public void feedMyPets(Collection<Pet> myHomies) {
		for (Pet homie: myHomies) {
			if (homie.getClass() == Cat.class) {
				System.out.printf("%s is having his KittyCat. \n", homie.getName());
			}
			else {
				System.out.printf("%s is having his Pedigree. \n", homie.getName());

			}
		}
	}
}
