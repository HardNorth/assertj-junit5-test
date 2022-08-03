import org.junit.jupiter.api.Test;

public class AssertJTest {
	@Test
	public void testAssertJAssumptions() {
		org.assertj.core.api.Assumptions
				.assumeThat(true)
				.isFalse();
	}
}
