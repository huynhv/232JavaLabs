package lab06;

import org.junit.Test;

import testbase.StdioTestBase;

public class ParadeShuffleTest extends StdioTestBase {

	@Test
	public void testSampleInput1() {
		String input = "4\n1 2 3 4\n1 3 2 4";
		String output = "Yes.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 1.");
	}

	@Test
	public void testSampleInput2() {
		String input = "4\n1 2 3 4\n1 4 2 3";
		String output = "No.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 2.");
	}
	
	// float come in reverse order of expected
	@Test
	public void testSampleInput3() {
		String input = "4\n4 3 2 1\n1 2 3 4";
		String output = "Yes.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	@Test
	public void testSampleInput4() {
		String input = "3\n3 2 1\n2 1 3";
		String output = "Yes.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	// floats already come in expected order
	@Test
	public void testSampleInput5() {
		String input = "4\n1 2 3 4\n1 2 3 4";
		String output = "Yes.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	@Test
	public void testSampleInput6() {
		String input = "4\n4 1 3 2\n1 2 3 4";
		String output = "Yes.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	@Test
	public void testSampleInput7() {
		String input = "4\n4 1 3 2\n1 3 2 4";
		String output = "Yes.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	@Test
	public void testSampleInput8() {
		String input = "4\n4 1 3 2\n3 1 4 2";
		String output = "Yes.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	@Test
	public void testSampleInput9() {
		String input = "4\n4 1 3 2\n3 4 1 2";
		String output = "No.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	// swap first and last floats
	@Test
	public void testSampleInput10() {
		String input = "4\n1 2 3 4\n4 2 3 1";
		String output = "No.";

		runTest(ParadeShuffle.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
}
