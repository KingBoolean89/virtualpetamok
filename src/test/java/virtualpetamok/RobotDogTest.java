package virtualpetamok;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotDogTest {
	@Test
	public void shouldHaveOilLevel() {
		RobotDog underTest = new RobotDog("", "");

		int result = underTest.getOilLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldLowerOilLevel() {
		RobotDog underTest = new RobotDog("", "");

		int roboOil = underTest.getOilLevel();
		underTest.oil();
		int roboOilAfterOiling = underTest.getOilLevel();
		int amountToOil = 5;

		assertThat(roboOilAfterOiling, is(equalTo(roboOil - amountToOil)));
	}

	@Test
	public void shouldLowerBoredomLevel() {
		RobotDog underTest = new RobotDog("", "");

		int petBoredom = underTest.getBoredomLevel();
		underTest.play();
		int petBoredomAfterPlay = underTest.getBoredomLevel();
		int amountOfPlay = 5;

		assertThat(petBoredomAfterPlay, is(equalTo(petBoredom - amountOfPlay)));
	}
}