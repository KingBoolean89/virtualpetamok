package virtualpetamok;

public class RobotDog extends VirtualPet implements RobotPet, Walkable {

	private int OIL_LEVEL = 50;

	public RobotDog(String NAME, String DESCRIPTION) {
		super(NAME, DESCRIPTION);

	}

	@Override
	public void oil() {
		OIL_LEVEL -= 5;

	}

	@Override
	public int getOilLevel() {
		// TODO Auto-generated method stub
		return OIL_LEVEL;
	}

	@Override
	public void play() {

		OIL_LEVEL -= 5;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

		OIL_LEVEL--;
	}

	@Override
	public void walk() {
		BOREDOM_LEVEL = 0;

		OIL_LEVEL--;
	}
	@Override
	public String toString() {
		return "Pets in the shelter [Petname=" + NAME + ", PetType=" + DESCRIPTION +  "]";
	}

}
