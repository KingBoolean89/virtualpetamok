package virtualpetamok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		VirtualPetShelter shelter = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		OrganicPets Dino = new OrganicDog("Dino", "Dog");
		shelter.addPet(Dino);

		RobotPet Barney = new RobotDog("Barney", "Robot dog");
		shelter.addPet(Barney);

		OrganicPets Fred = new OrganicCat("Fred", "Cat");
		shelter.addPet(Fred);

		RobotPet Wilma = new RobotCat("Wilma", "Robot cat");
		shelter.addPet(Wilma);

		boolean exit = false;

		do {
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof OrganicDog) {
					if (((OrganicDog) pet).getWasteLevel() >= 10) {
						System.out.print(pet.getName() + "'s cage needs cleaning.");
						((OrganicDog) pet).tick();
					}
				}
			}
			if (shelter.getWasteLevel() >= 15) {
				System.out.print(" The cats are getting sick because the litter box are a mess.");
				for (VirtualPet pet : shelter.pets()) {
					if (pet instanceof OrganicCat) {
						((OrganicCat) pet).tick();
					}
				}
			}
			System.out.println("\nWelcome to The Virtual Pet Shelter");
			System.out.println("\nThis is the status of the pets: ");
			System.out.println("\nName\t|Mood\t|Health\t|Hunger\t|Thirst\t|Oil\t|WasteLevel");
			System.out.println("________|_______|_______|_______|_______|_______|_________|");

			for (VirtualPet currentPet : shelter.pets()) {
				System.out.print(currentPet.getName() + "\t|" + ((VirtualPet) currentPet).getBoredomLevel() + "\t|"
						+ ((VirtualPet) currentPet).getHealthLevel() + "\t|");
				if (currentPet instanceof OrganicPets) {
					System.out.print(((OrganicPets) currentPet).getHungerLevel() + "\t|"
							+ ((OrganicPets) currentPet).getThirstLevel() + "\t|0\t|");
				} else if (currentPet instanceof RobotPet) {
					System.out.print("0\t|0\t|" + ((RobotPet) currentPet).getOilLevel() + "\t|");
				}
				if (currentPet instanceof OrganicDog) {
					System.out.print("" + ((OrganicDog) currentPet).getWasteLevel() + "\t|");
				} else {
					System.out.print("0\t|");
				}
				System.out.print("\n");

			}

			
			System.out.println("\nWhat would you like to do next?");
			System.out.println("Select a number to continue");

			System.out.println("| 1. Feed Pets         |");
			System.out.println("| 2. Give Water        |");
			System.out.println("| 3. Play With one Pet |");
			System.out.println("| 4. Adopt             |");
			System.out.println("| 5. Give a pet away   |");
			System.out.println("| 6. Clean Cages       |");
			System.out.println("| 7. Clean Litterbox's |");
			System.out.println("| 8. Walk all dogs     |");
			System.out.println("| 9. Oil all robots    |");
			System.out.println("| 10. Exit the shelter |");

			String userResponse = input.nextLine();

			switch (userResponse) {
			case "1":
				shelter.feedOrganic();
				System.out.print("You fed all the pets.");
				break;
			case "2":
				shelter.waterOrganic();
				System.out.print("You gave water to all the  pets.");
				break;
			case "3":
				System.out.println("Choose a pet to play with?");
				displayPets(shelter);
				String petName = input.nextLine();
				shelter.playWithOne(shelter.getPet(petName));
				System.out.println("You played with " + shelter.getPet(petName) + ". ");
				break;
			case "4":
				System.out.print("You selected to adopt a pet. Please choose one:\n");
				displayPets(shelter);
				System.out.print("\nWhich pet would you like to adopt");
				String nameToAdopt = input.nextLine();
				VirtualPet x = shelter.getPet(nameToAdopt);
				shelter.adoptPet(x);
				System.out.print("You adopted " + nameToAdopt + ". I'm sure they're in good hands!");
				break;
			case "5":
				System.out.print("Is this an organic or robot pet?");
				String response2 = input.next();
				if (response2.equalsIgnoreCase("organic")) {
					System.out.print("Is this a cat or dog?");
					String response3 = input.next();
					input.nextLine();

					if (response3.equalsIgnoreCase("dog")) {
						System.out.print("What is the dog's name?");
						String name = input.nextLine();

						System.out.print("What type of dog is this?");
						String description = input.nextLine();

						OrganicPets pet = new OrganicDog(name, description);
						shelter.addPet(pet);
						System.out.print("We'll take good care of " + pet.getName() + ".");
					} else if (response3.equalsIgnoreCase("cat")) {
						System.out.print("What is the cat's name?");
						String name = input.nextLine();

						System.out.print("What type of cat is this?");
						String description = input.nextLine();

						OrganicPets pet = new OrganicCat(name, description);
						shelter.addPet(pet);
						System.out.print("We'll take good care of " + pet.getName() + ".");
					}

				} else if (response2.equalsIgnoreCase("robot")) {
					System.out.print("Is this a dog or cat?");
					String response3 = input.next();
					input.nextLine();

					if (response3.equalsIgnoreCase("dog")) {
						System.out.print("What's the dog's name?");
						String name = input.nextLine();
						System.out.print("What type of robot dog is this?");
						String description = input.nextLine();

						RobotPet pet = new RobotDog(name, description);
						shelter.addPet(pet);
						System.out.print("Thanks " + pet.getName() + " will be well took care of.");

					} else if (response3.equalsIgnoreCase("cat")) {
						System.out.print("What is the cat's name?");
						String name = input.nextLine();
						System.out.print("What kind of robot cat is this?");
						String description = input.nextLine();

						RobotPet pet = new RobotCat(name, description);
						shelter.addPet(pet);
						System.out.print("We'll take good care of " + pet.getName() + ".");
					}
				}
				break;
			case "6":
				shelter.cleanAll();
				System.out.print("You cleaned all the dog cages.");
				break;
			case "7":
				shelter.cleanAll();
				System.out.print("You cleaned the litter box's.");
				break;
			case "8":
				shelter.walkDogs();
				System.out.print("You walked the dogs! Their cages are  less  messy.");
				break;
			case "9":
				shelter.OilAllRobots();
				System.out.print("You oiled the robotic pets!");
				break;
			case "10":
				System.out.print("Quitter");
				System.exit(0);
			default:
				System.out.print("Please try again.");
				break;

			}
			shelter.tick();

		} while (!exit);
		input.close();

	}

	private static void displayPets(VirtualPetShelter shelter) {
		for (VirtualPet currentPet : shelter.pets()) {
			System.out.print("" + currentPet);
		}
	}

}
