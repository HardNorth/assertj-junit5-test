import org.junit.AssumptionViolatedException;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

public class AssumptionExceptionTest {
	@Test
	public void testTestAbortedException() {
		throw new TestAbortedException();
	}

	@Test
	public void testAssumptionViolatedException() {
		throw new AssumptionViolatedException("");
	}
}
