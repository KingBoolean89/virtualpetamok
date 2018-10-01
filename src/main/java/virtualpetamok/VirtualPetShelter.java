package virtualpetamok;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	public void OilAllRobots() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RobotPet) {
				((RobotPet) pet).oil();
			}
		}
	}

	public void cleanAll() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPets) {
				((OrganicPets) pet).clean();
			}
		}
	}

	public void walkDogs() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).walk();
			}
		}

	}

	public void addPet(VirtualPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void addPet(RobotPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void addPet(OrganicPets pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void feedOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPets) {
				((OrganicPets) pet).feed();
			}
		}

	}

	public void waterOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPets) {
				((OrganicPets) pet).water();
			}
		}

	}

	public void tick() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RobotCat) {
				pet.tick();

			}
			if (pet instanceof RobotDog) {
				pet.tick();

			}
			if (pet instanceof OrganicCat) {
				pet.tick();

			}
			if (pet instanceof OrganicDog) {
				pet.tick();

			}
		}
	}

	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	public VirtualPet getPet(String name) {
		return shelterPets.get(name);

	}

	public void playWithOne(VirtualPet playingWithAPet) {
		playingWithAPet.play();
	}

	public void adoptPet(VirtualPet pet) {
		shelterPets.remove(pet.getName());
	}

	public int getWasteLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
}
