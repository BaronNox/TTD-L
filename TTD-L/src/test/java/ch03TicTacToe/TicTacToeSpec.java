package ch03TicTacToe;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TicTacToeSpec
{
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	private TicTacToe ticTacToe;
	
	@Before
	public final void before() {
		ticTacToe = new TicTacToe();
	}
	
	@Test
	public void whenXOutsideBoardThenRuntimeException() {
		exception.expect(RuntimeException.class);
		ticTacToe.play(5, 2);
	}
	
	@Test
	public void whenYOutsideBoadThenRuntimeException() {
		exception.expect(RuntimeException.class);
		ticTacToe.play(2, 4);
	}
	
	@Test
	public void whenOccupiedThenRuntimeExceotion() {
		ticTacToe.play(1, 3);
		exception.expect(RuntimeException.class);
		ticTacToe.play(1, 3);
	}
}
