package petsplace;


import homies.abstraction.Pet;
import homies.abstraction.Type;
import homies.impl.Cat;
import homies.impl.Dog;
import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PetCollectorTest {
	List<Pet> expected = List.of(
			new Cat().setName("Kitty").setType(Type.CAT),
			new Cat().setName("Rusty").setType(Type.CAT),
			new Dog().setName("Fluffy").setType(Type.DOG),
			new Dog().setName("Shagal").setType(Type.DOG)
	);
	@Test
	public void testPetsCollectorCollectionCompletion() {
		var actual = new ArrayList<>(PetCollector.myHomePets);

		Assertions.assertEquals(expected, actual);
	}
}