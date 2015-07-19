package org.letsgodev.poker;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * {@link PokerHand}のテストクラス。
 */ 
public class PokerHandTest {

	/**
	 * 仮実装です。
	 */
	@Test
	public void 手札がワンペアか否か判定できること() {
		PokerHand pokerHand = new PokerHand();
		assertTrue(pokerHand.isOnePair());
	}
}