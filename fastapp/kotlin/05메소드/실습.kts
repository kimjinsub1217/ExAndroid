// 함수 선언 방법
fun plusNumbers(firstNum: Int, secondNum: Int): Int {
    val result: Int = firstNum + secondNum
    return result
}

// 함수 호출 방법
plusNumbers(3, 7)
val result: Int = plusNumbers(firstNum = 3, secondNum = 7)
println(result)

// 기본값이 있는 함수를 선언 하는 방법

fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 10): Int {
    return firstNum + secondNum
}

val result2: Int = plusNumbersWithDefault(firstNum = 10)
println(result2)
val result3: Int = plusNumbersWithDefault(firstNum = 10, secondNum = 20)
println(result3)

// 반환값이 없는 함수를 선언 방법
// Unit을 안써도 됨
fun plusNumberWithNoReturn(firstNum: Int, secondNum: Int): Unit {
    val result: Int = firstNum + secondNum
    println(result)
}

plusNumberWithNoReturn(100, 200)

// 함수 선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum
val result10: Int = shortPlusNumbers(firstNum = 10, secondNum = 100)
println(result10)

// 가변인자를 갖는 함수
fun PlustMultipleNumbers(vararg numbers: Int): Unit {
//    println(numbers)

    for (number in numbers) {
        println(number)
    }
}
PlustMultipleNumbers(1, 2, 3, 4, 5, 6, 7)

