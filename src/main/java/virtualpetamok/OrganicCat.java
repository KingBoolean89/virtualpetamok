package virtualpetamok;

public class OrganicCat extends VirtualPet implements OrganicPets {

	private int HUNGER = 50;
	private int THIRST = 50;
	private int WASTE = 50;

	public OrganicCat(String NAME, String DESCRIPTION) {
		super(NAME, DESCRIPTION);

	}

	public int getHungerLevel() {
		// TODO Auto-generated method stub
		return HUNGER;
	}

	public int getThirstLevel() {
		// TODO Auto-generated method stub
		return THIRST;
	}

	public int getWasteLevel() {
		// TODO Auto-generated method stub
		return WASTE;
	}

	public void feed() {
		HUNGER -= 5;

	}

	public void water() {
		THIRST -= 5;

	}

	@Override
	public void clean() {
		WASTE -= 5;

	}

	@Override
	public void play() {
		BOREDOM_LEVEL--;
		WASTE++;
		THIRST++;

	}

	@Override
	public void tick() {
		WASTE++;
		THIRST++;
		HEALTH_LEVEL--;

	}
	@Override
	public String toString() {
		return "Pets in the shelter [Petname=" + NAME + ", PetType=" + DESCRIPTION +  "]";
	}
}
