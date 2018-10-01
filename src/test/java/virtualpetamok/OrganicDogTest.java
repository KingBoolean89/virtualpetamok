package virtualpetamok;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {
	@Test
	public void shouldHaveHungerLevel() {
		OrganicDog underTest = new OrganicDog("", "");

		int result = underTest.getHungerLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldHaveThirstLevel() {
		OrganicDog underTest = new OrganicDog("", "");

		int result = underTest.getThirstLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldHaveWasteLevel() {
		OrganicDog underTest = new OrganicDog("", "");

		int result = underTest.getWasteLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldLowerHungerLevel() {
		OrganicDog underTest = new OrganicDog("", "");

		int petHunger = underTest.getHungerLevel();
		underTest.feed();
		int petHungerAfterFeeding = underTest.getHungerLevel();
		int amountToFeed = 5;

		assertThat(petHungerAfterFeeding, is(equalTo(petHunger - amountToFeed)));
	}

	@Test
	public void shouldLowerThirstLevel() {
		OrganicDog underTest = new OrganicDog("", "");

		int petThirst = underTest.getThirstLevel();
		underTest.water();
		int petThirstAfterWater = underTest.getThirstLevel();
		int amountToDrink = 5;

		assertThat(petThirstAfterWater, is(equalTo(petThirst - amountToDrink)));
	}

	@Test
	public void shouldLowerBoredomLevel() {
		OrganicDog underTest = new OrganicDog("", "");

		int petBoredom = underTest.getBoredomLevel();
		underTest.play();
		int petBoredomAfterPlay = underTest.getBoredomLevel();
		int amountOfPlay = 5;

		assertThat(petBoredomAfterPlay, is(equalTo(petBoredom - amountOfPlay)));
	}

	@Test
	public void shouldLowerWasteLevel() {
		OrganicDog underTest = new OrganicDog("", "");

		int petWaste = underTest.getWasteLevel();
		underTest.clean();
		int petWasteAfterCleaning = underTest.getWasteLevel();
		int amountCleaned = 5;

		assertThat(petWasteAfterCleaning, is(equalTo(petWaste - amountCleaned)));
	}
}
