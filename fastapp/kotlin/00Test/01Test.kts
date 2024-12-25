/*
1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는 변수 c를 선언한다
   단 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다

2. 정수형 변수 A를 선언하고, 변수 B를 선언 한다 이때 변수 B는 A의 두배가 되어야 한다

3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
   (90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F학점)

4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수(정수)를 반환하는 함수를 만드시오
   (시험 문제는 총 20문제이고 만점은 100점)

5. nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다
   이때 인수중에 null 이 있으면 0으로 취급하여 합을 구한다
 */

// 1
var num1: Int = 2
var num2: Int = 5
var num3: Boolean = if (num1 == num2) true else false
println(num3)

// 2
var num4: Int = 10
var num5: Int = num4 * 2
println(num5)

// 3
val studentScore: Int = 91
checkGrand(studentScore)

fun checkGrand(studentScore: Int) {
    when (studentScore) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        else -> println("F")
    }
}

// 4
fun score(count: Int): Int {
    if (count > 20) {
        return 0
    } else {
        return count * 5
    }
}
println(score(11))

// 5
fun plusTwoNumbers(firstNum: Int?, secondNum: Int?): Int {
    val first: Int = if (firstNum == null) 0 else firstNum
    val second: Int = if (secondNum == null) 0 else secondNum
    return first + second
}

println(plusTwoNumbers(3, 3))

