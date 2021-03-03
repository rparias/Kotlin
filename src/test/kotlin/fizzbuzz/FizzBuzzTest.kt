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
}