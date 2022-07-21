package petsplace;

import homies.impl.Cat;
import homies.impl.Dog;
import homies.abstraction.Pet;
import homies.abstraction.Type;

import java.util.ArrayList;
import java.util.List;

public class PetCollector {
	public static List<Pet> myHomePets = new ArrayList<>();

	static {
		Cat cat1 = new Cat();
		cat1.setName("Kitty").setType(Type.CAT);
		Cat cat2 = new Cat();
		cat2.setName("Rusty").setType(Type.CAT);

		Dog dog1 = new Dog();
		dog1.setName("Fluffy").setType(Type.DOG);
		Dog dog2 = new Dog();
		dog2.setName("Shagal").setType(Type.DOG);

		myHomePets.addAll(
				List.of(
						cat1,
						cat2,
						dog1,
						dog2));
	}
}
