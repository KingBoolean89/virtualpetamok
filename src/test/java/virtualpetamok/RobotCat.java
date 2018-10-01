package virtualpetamok;

public class RobotCat extends VirtualPet implements RobotPet {

	private int OIL_LEVEL = 50;

	public RobotCat(String NAME, String DESCRIPTION) {
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

		OIL_LEVEL--;

	}
	@Override
	public String toString() {
		return "Pets in the shelter [Petname=" + NAME + ", PetType=" + DESCRIPTION +  "]";
	}

}
