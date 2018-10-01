package virtualpetamok;

public class OrganicDog extends VirtualPet implements OrganicPets, Walkable {

	private int HUNGER = 50;
	private int THIRST = 50;
	private int WASTE = 50;

	public OrganicDog(String NAME, String DESCRIPTION) {
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
		// TODO Auto-generated method stub
		HEALTH_LEVEL += 10;
		WASTE = 0;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		BOREDOM_LEVEL--;
		WASTE++;
		THIRST++;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		WASTE++;
		THIRST++;
		HEALTH_LEVEL--;

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		WASTE = 0;
		WASTE++;
		THIRST++;
	}
	@Override
	public String toString() {
		return "Pets in the shelter [Petname=" + NAME + ", PetType=" + DESCRIPTION +  "]";
	}
}
