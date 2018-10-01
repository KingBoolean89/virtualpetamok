package virtualpetamok;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


//public class VirtualPetShelterTest {
//	@Test
//	public void shouldReturnOrganicDog() {
//		VirtualPet underTest = new OrganicDog(null, null);
//
//		underTest.addPet();
//		underTest.addPet();
//
//		Collection<VirtualPet> result = underTest.getPet();
//
//		assertThat(result, contains(new VirtualPet("", "", 0, 0, 0), new VirtualPet("", "", 0, 0, 0)));
//	}
//
//	@Test
//	public void shouldAddDragon() {
//		VirtualPet underTest = new VirtualPet();
//
//		underTest.addPet("", "");
//		underTest.addPet("", "");
//
//		Collection<VirtualPet> result = underTest.get();
//
//		assertThat(result, contains(new VirtualPet("", "", 0, 0, 0), new VirtualPet("", "  ", 0, 0, 0)));
//	}
//
//	@Test
//	public void shouldRemovePet() {
//		VirtualPetShelter underTest = new VirtualPetShelter();
//
//		underTest.addPet("King", "");
//		underTest.addPet("", "");
//		underTest.addPet(null);
//
//		Collection<VirtualPet> result = underTest.getPets();
//
//		assertThat(result, contains(new VirtualPet("", "", 0, 0, 0), new VirtualPet("", "  ", 0, 0, 0)));
//	}
//
//	@Test
//	public void shouldfeedAll() {
//		VirtualPet underTest = new VirtualPet("", "", 0, 0, 0);
//
//		underTest.feed();
//		Map<String, VirtualPet> dragons = new HashMap<String, VirtualPet>();
//
//		assertEquals(3, underTest.getHungerLevel());
//	}
//
//	@Test
//	public void shouldGiveWaterToAll() {
//		VirtualPet underTest = new VirtualPet("", "", 0, 0, 0);
//		Map<String, VirtualPet> dragons = new HashMap<String, VirtualPet>();
//
//		assertEquals(3, underTest.getHungerLevel());
//	}
//
//	@Test
//	public void shouldGoOnWalk() {
//		VirtualPet underTest = new OrganicDog("", "");
//
//		underTest.walk();
//
//		assertEquals(3, underTest.getThirstLevel());
//	}
//
//	@Test
//	public void shouldtickAll() {
//		VirtualPet underTest = new VirtualPet("", "", 0, 0, 0);
//		Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
//
//		assertEquals(-1, underTest.getHungerLevel());
//	}
//
//	private void assertThat(Collection<VirtualPet> result, Object contains) {
//		// TODO Auto-generated method stub
//
//	}
//
//	private Object contains(VirtualPet virtualPet, VirtualPet virtualPet1) {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//}
//
//
