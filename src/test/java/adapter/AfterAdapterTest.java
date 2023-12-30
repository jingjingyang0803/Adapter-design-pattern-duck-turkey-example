package adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterAdapterTest {
	private Duck turkeyAdapter;
	private ByteArrayOutputStream output;

	@BeforeEach
	public void setUp() {
		WildTurkey wildTurkey = new WildTurkey();
		turkeyAdapter = new TurkeyAdapter(wildTurkey);
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
	}

	@Test
	public void testTurkeyAdapterQuack() {
		turkeyAdapter.quack();
		assertEquals("Gobble gobble\n", output.toString());
	}


	@Test
	public void testTurkeyAdapterFly() {
		turkeyAdapter.fly();
		String expectedOutput = "";
		for (int i = 0; i < 5; i++) {
			expectedOutput += "I'm flying a short distance\n";
		}
		assertEquals(expectedOutput, output.toString());
	}
}