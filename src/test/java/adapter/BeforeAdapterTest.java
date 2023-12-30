package adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeAdapterTest {
	private MallardDuck mallardDuck;
	private WildTurkey wildTurkey;
	private Duck turkeyAdapter;
	private ByteArrayOutputStream output;

	@BeforeEach
	public void setUp() {
		mallardDuck = new MallardDuck();
		wildTurkey = new WildTurkey();
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
	}

	@Test
	public void testMallardDuckQuack() {
		mallardDuck.quack();
		assertEquals("Quack\n", output.toString());
	}

	@Test
	public void testMallardDuckFly() {
		mallardDuck.fly();
		assertEquals("I'm flying\n", output.toString());
	}

	@Test
	public void testWildTurkeyGobble() {
		wildTurkey.gobble();
		assertEquals("Gobble gobble\n", output.toString());
	}

	@Test
	public void testWildTurkeyFly() {
		wildTurkey.fly();
		assertEquals("I'm flying a short distance\n", output.toString());
	}
}
