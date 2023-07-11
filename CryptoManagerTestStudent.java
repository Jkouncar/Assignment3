import org.junit.Assert;
import org.junit.Test;

public class CryptoManagerTestStudent {

	@Test
	public void testIsStringInBounds() {
		// Test string within bounds
		Assert.assertTrue(CryptoManager.isStringInBounds("B"));

		// Test string with characters outside bounds
		Assert.assertFalse(CryptoManager.isStringInBounds("Hello, World!"));
		Assert.assertFalse(CryptoManager.isStringInBounds("{"));
		Assert.assertFalse(CryptoManager.isStringInBounds("`"));
	}

	@Test
	public void testCaesarEncryption() {
		Assert.assertEquals("K\"NQXG\"LCXC", CryptoManager.caesarEncryption("I LOVE JAVA", 2));
	}

	@Test
	public void testCaesarDecryption() {
		Assert.assertEquals("I LOVE JAVA", CryptoManager.caesarDecryption("K\"NQXG\"LCXC", 2));
	}

	@Test
	public void testBellasoEncryption() {
		Assert.assertEquals("726G", CryptoManager.bellasoEncryption("TEST", "CMCS 203 IS COOL"));
	}

	@Test
	public void testBellasoDecryption() {
		Assert.assertEquals("TEST", CryptoManager.bellasoDecryption("726G", "CMCS 203 IS COOL"));
	}
}