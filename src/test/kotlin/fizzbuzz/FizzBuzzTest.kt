package fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    internal fun `returns the same number as string when it is not divisible for 3 or 5`() {
        val result = fizzBuzz(2)
        assertThat(result).isEqualTo("2")
    }

    @Test
    internal fun `returns fizz when number is divisible by 3`() {
        val result = fizzBuzz(9)
        assertThat(result).isEqualTo("fizz")
    }

    @Test
    internal fun `returns buzz when number is divisible by 5`() {
        val result = fizzBuzz(55)
        assertThat(result).isEqualTo("buzz")
    }

    @Test
    internal fun `returns fizzbuzz when number is divisible by 3 and 5`() {
        val result = fizzBuzz(30)
        assertThat(result).isEqualTo("fizzbuzz")
    }

    @Test
    internal fun `returns a string according with a range of two numbers`() {
        val result = fizzBuzzInRange(1, 7)
        assertThat(result).isEqualTo("1 2 fizz 4 buzz fizz 7")
    }

    @Test
    internal fun `returns a string according with a range of two numbers since 14 to 17`() {
        val result = fizzBuzzInRange(14, 17)
        assertThat(result).isEqualTo("14 fizzbuzz 16 17")
    }
}