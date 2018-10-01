package virtualpetamok;

public abstract class VirtualPet {
	protected final String NAME;
	protected final String DESCRIPTION;
	protected int HEALTH_LEVEL = 50;
	protected int BOREDOM_LEVEL = 50;

	public VirtualPet(String NAME, String DESCRIPTION) {
		this.NAME = NAME;
		this.DESCRIPTION = DESCRIPTION;

	}

	public String getName() {
		return NAME;

	}

	public String getDescription() {

		return DESCRIPTION;
	}

	public int getHealthLevel() {
		// TODO Auto-generated method stub
		return HEALTH_LEVEL;
	}

	public int getBoredomLevel() {
		// TODO Auto-generated method stub
		return BOREDOM_LEVEL;
	}
	@Override
	public String toString() {
		return "Pets in the shelter [Petname=" + NAME + ", PetType=" + DESCRIPTION +  "]";
	}
	

	public abstract void play();

	public abstract void tick();

}
