package smartCast

import Expression
import Num
import Sum
import evaluate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class ExpressionTest {

    @Test
    internal fun `given a num value then returns the same value as integer`() {
        val originalValue: Expression = Num(3)
        val result: Int = evaluate(originalValue)
        assertThat(result).isEqualTo(3);
    }

    @Test
    internal fun `given a sum values then returns the result as integer`() {
        val originalValue: Expression = Sum(Num(2), Num(5))
        val result: Int = evaluate(originalValue)
        assertThat(result).isEqualTo(7);
    }
}