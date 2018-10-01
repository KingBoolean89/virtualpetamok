package virtualpetamok;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

//public class VirtualPetTest {
//	@Test
//	public void shouldHaveName() {
//		VirtualPet underTest = new VirtualPet("", "", 0, 0);
//
//		String result = underTest.getname();
//
//		assertEquals("", result);
//	}
//
//	@Test
//	public void shouldHaveDescription() {
//		VirtualPet underTest = new VirtualPet("", "", 0, 0);
//
//		String result = underTest.getdescription();
//
//		assertEquals("", result);
//	}
//
//	@Test
//	public void shouldHaveHealthLevel() {
//		VirtualPet underTest = new VirtualPet("", "", 50, 0 );
//
//		int result = underTest.getHealthLevel();
//
//		assertEquals(50, result);
//	}
//
//	@Test
//	public void shouldHaveBoredomLevel() {
//		VirtualPet underTest = new VirtualPet("", "", 7, 50);
//
//		int result = underTest.getBoredomLevel();
//
//		assertEquals(50, result);
//	}
//	@Test
//	public void shouldLowerBoredomLevel() {
//		VirtualPet underTest = new VirtualPet("", "", 7, 50);
//		
//		int petBoredom = underTest.getBoredomLevel();
//		underTest.play();
//		int petBoredomAfterPlay = underTest.getBoredomLevel();
//		int amountOfPlay = 5;
//		
//		assertThat(petBoredomAfterPlay, is(equalTo(petBoredom - amountOfPlay)));
//	}
//	@Test
//	public void shouldLowerHealthAndBoredomLevel() {
//		VirtualPet underTest = new VirtualPet("", "", 10, 10);
//		int petBoredomAfterPlay = underTest.getBoredomLevel();
//		int petBoredom = underTest.getBoredomLevel();
//		int petTick = underTest.getHealthLevel();
//		underTest.tick();
//		int amountOfPlay = 0;
//		int petHealthAfterPlay = underTest.getHealthLevel();
//		int amountOfTick = 0;
//		assertThat(petBoredomAfterPlay, is(equalTo(petBoredom - amountOfPlay)));
//		assertThat(petHealthAfterPlay, is(equalTo(petTick - amountOfTick  )));
//	}
//
//
//
//}
//
//
//
