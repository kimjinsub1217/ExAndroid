//if
val number1: Int = 10

if (number1 == 10) {// 조건식은 무조건 true 또는 false로 결과가 나와야 한다.
// 위 조건을 만족하는 경우
    println("10입니다")
} else if (number1 == 20) {
//    위 조건을 만족하는 경우
    println("20입니다")
} else {
//    위 2가지 조건을 모두 만족하지 않은 경우
    println("둘다 아님")
}

if (number1 == 10) println("10입니다")
else if (number1 == 20) println("10입니다")
else println("둘다 아님")

val number2: Int = 10 + 20
val number3: Int = if (number2 > 30) 40 else 50
println(number3)

// 표현과 식
// 표현 val,var,Int,Short -> 키워드
// 식 값을 만들어 낸다. -> 10+20, 10-30


// when
val number4: Int = 5
when (number4) {
    5 -> {
        println("5 입니다.")
    }

    6 -> {
        println("6입니다")
    }

    else -> {
        println("둘다 아님")
    }
}

when (number4) {
    5 -> println("5 입니다.")
    6 -> println("6 입니다.")
    else -> println("모르겠어요.")
}

//when (number4) {
//    4 -> println("number is 4")
//    "안녕하세요" -> println("hello")
//    is Boolean -> println("boolean")
//}

when (number4) {
    in 1..10 -> println("number iis in 1..10") // number4 in 1..10 -> Boolean
    in 20..30 -> println("number iis in 20..30")
    in 40..50 -> println("number iis in 40..50")
}


val number5: String = "안녕하세요"
when (number5) {
    "apple" -> println("사과")
    "안녕하세요" -> println("hello")
}