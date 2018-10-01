package virtualpetamok;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotCatTest {
	@Test
	public void shouldHaveOilLevel() {
		RobotCat underTest = new RobotCat("", "");

		int result = underTest.getOilLevel();

		assertEquals(50, result);
	}

	@Test
	public void shouldLowerOilLevel() {
		RobotCat underTest = new RobotCat("", "");

		int roboOil = underTest.getOilLevel();
		underTest.oil();
		int roboOilAfterOiling = underTest.getOilLevel();
		int amountToOil = 5;

		assertThat(roboOilAfterOiling, is(equalTo(roboOil - amountToOil)));
	}

	@Test
	public void shouldLowerBoredomLevel() {
		RobotCat underTest = new RobotCat("", "");

		int petBoredom = underTest.getBoredomLevel();
		underTest.play();
		int petBoredomAfterPlay = underTest.getBoredomLevel();
		int amountOfPlay = 5;

		assertThat(petBoredomAfterPlay, is(equalTo(petBoredom - amountOfPlay)));
	}
}
