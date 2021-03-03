package fizzbuzz

fun fizzBuzz(number: Int) : String =
    when {
        number % 15 == 0 -> "fizzbuzz"
        number % 3 == 0 -> "fizz"
        number % 5 == 0 -> "buzz"
        else -> "$number"
    }