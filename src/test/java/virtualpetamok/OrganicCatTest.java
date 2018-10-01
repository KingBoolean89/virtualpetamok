package virtualpetamok;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {

	@Test
	public void shouldHaveHungerLevel() {
		OrganicCat underTest = new OrganicCat("", "");

		int result = underTest.getHungerLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldHaveThirstLevel() {
		OrganicCat underTest = new OrganicCat("", "");

		int result = underTest.getThirstLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldHaveWasteLevel() {
		OrganicCat underTest = new OrganicCat("", "");

		int result = underTest.getWasteLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldLowerHungerLevel() {
		OrganicCat underTest = new OrganicCat("", "");

		int petHunger = underTest.getHungerLevel();
		underTest.feed();
		int petHungerAfterFeeding = underTest.getHungerLevel();
		int amountToFeed = 5;

		assertThat(petHungerAfterFeeding, is(equalTo(petHunger - amountToFeed)));
	}

	@Test
	public void shouldLowerThirstLevel() {
		OrganicCat underTest = new OrganicCat("", "");

		int petThirst = underTest.getThirstLevel();
		underTest.water();
		int petThirstAfterWater = underTest.getThirstLevel();
		int amountToDrink = 5;

		assertThat(petThirstAfterWater, is(equalTo(petThirst - amountToDrink)));
	}

	@Test
	public void shouldLowerBoredomLevel() {
		OrganicCat underTest = new OrganicCat("", "");

		int petBoredom = underTest.getBoredomLevel();
		underTest.play();
		int petBoredomAfterPlay = underTest.getBoredomLevel();
		int amountOfPlay = 5;

		assertThat(petBoredomAfterPlay, is(equalTo(petBoredom - amountOfPlay)));
	}

	@Test
	public void shouldLowerWasteLevel() {
		OrganicCat underTest = new OrganicCat("", "");

		int petWaste = underTest.getWasteLevel();
		underTest.clean();
		int petWasteAfterCleaning = underTest.getWasteLevel();
		int amountCleaned = 50;

		assertThat(petWasteAfterCleaning, is(equalTo(petWaste - amountCleaned)));
	}
}
