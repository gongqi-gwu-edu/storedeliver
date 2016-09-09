package storedeliver;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qigong.WhiteBoard;

public class WhiteBoardTest {
	@Test
	public void testWhiteBoard() {
		WhiteBoard whiteBoard = new WhiteBoard();
		assertEquals("OK", 1, whiteBoard.getNumber());
		whiteBoard.go("north");
		assertEquals("OK", 2, whiteBoard.getNumber());
		whiteBoard.go("south");
		assertEquals("OK", 2, whiteBoard.getNumber());
		whiteBoard.go("east");
		assertEquals("OK", 3, whiteBoard.getNumber());
		whiteBoard.go("west");
		assertEquals("OK", 3, whiteBoard.getNumber());
		whiteBoard.go("west");
		assertEquals("OK", 4, whiteBoard.getNumber());
		whiteBoard.go("south");
		assertEquals("OK", 5, whiteBoard.getNumber());
		whiteBoard.go("south");
		assertEquals("OK", 6, whiteBoard.getNumber());
	}
}
