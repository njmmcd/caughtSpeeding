package caughtSpeeding;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestSpeeding {

	@Test
	public void test() {
		assertEquals(0, Speeding.caughtSpeeding(60, false));
		assertEquals(1, Speeding.caughtSpeeding(65, false));
		assertEquals(0, Speeding.caughtSpeeding(65, true));
	}

}
