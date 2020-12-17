import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz;
	String[] result;

	@BeforeEach
	public void setUp(){
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void check_fizz_when_number_is_divisible_by_3() {
		result = fizzBuzz.execute();

		assertEquals("Fizz", result[3]);
	}

	@Test
	public void check_buzz_when_number_divisible_by_5(){
		String[] result = fizzBuzz.execute();

		assertEquals("Buzz", result[5]);
	}

	@Test
	public void check_retrieves_number_when_number_is_not_divisible_by_3_or_5(){
		String[] result = fizzBuzz.execute();

		assertEquals("2", result[2]);
	}

	@Test
	public void check_fizzbuzz_when_number_divisible_by_3_and_5(){
		String[] result = fizzBuzz.execute();

		assertEquals("FizzBuzz", result[15]);
	}

	@Test
	public void check_array_size_is_100(){
		String[] result = fizzBuzz.execute();

		assertEquals(result.length, 100);
	}
}
