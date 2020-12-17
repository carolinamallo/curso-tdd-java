import static org.junit.jupiter.api.Assertions.assertEquals;

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
	public void check_retrieves_fizz_when_number_is_divisible_by_3() {
		result = fizzBuzz.execute();

		assertEquals("Fizz", result[3]);
//		assertEquals("Fizz", FizzBuzz.values().get(3));
	}

	@Test
	public void check_retrieves_buzz_when_number_divisible_by_5(){
		String[] result = fizzBuzz.execute();

		assertEquals("Buzz", result[5]);
	}

	@Test
	public void check_retrieves_number_when_number_is_not_divisible_by_3_or_5(){
		String[] result = fizzBuzz.execute();

		assertEquals("2", result[2]);
	}

	@Test
	public void check_retrieves_fizzbuzz_when_number_divisible_by_3_and_5(){
		String[] result = fizzBuzz.execute();

		assertEquals("FizzBuzz", result[15]);
		assertEquals("FizzBuzz", result[35]);
		assertEquals("FizzBuzz", result[53]);
	}

	@Test
	public void check_array_size_is_100(){
		String[] result = fizzBuzz.execute();

		assertEquals(result.length, 100);
	}

	@Test
	public void check_retrieves_fizz_when_number_contains_3(){
		String[] result = fizzBuzz.execute();

		assertEquals("Fizz", result[13]);
		assertEquals("Fizz", result[31]);
	}

	@Test
	public void check_retrieves_buzz_when_number_contains_5(){
		String[] result = fizzBuzz.execute();

		assertEquals("Buzz", result[55]);
		assertEquals("Buzz", result[52]);
		assertEquals("Buzz", result[25]);
	}
}
