import java.lang.IllegalArgumentException

interface Expression
class Num (val value: Int) : Expression
class Sum (val left: Expression, val right: Expression) : Expression

fun evaluate(e: Expression) : Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            evaluate(e.left) + evaluate(e.right)
        else ->
            throw IllegalArgumentException("Unknown Expression")
    }