package homies.abstraction;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Setter
@Getter
public abstract class Pet {
	String name;
	Type type;
}
