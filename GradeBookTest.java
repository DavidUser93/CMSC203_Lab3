package lab3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook b1;
	GradeBook b2;
	@BeforeEach
	void setUp() throws Exception {
		b1 = new GradeBook(5);
		b2 = new GradeBook(5);
		b1.addScore(11.12);
		b1.addScore(12.12);
		b1.addScore(125.12);
		b1.addScore(124.12);
		b1.addScore(123.12);
		b2.addScore(543.41);
		b2.addScore(123.31);
	}

	@AfterEach
	void tearDown() throws Exception {
		b1 = null;
		b2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(b1.toString().equals("11.12 12.12 125.12 124.12 123.12 "));
		assertEquals(b1.getScoreSize(),5);
	}

	@Test
	void testSum() {
		assertEquals(b2.sum(),666.72, 0.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(b2.minimum(),123.31,0.01);
	}

	@Test
	void testFinalScore() {
		assertEquals(b2.finalScore(),(double)((double)(543.41+123.31)-123.31));
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
