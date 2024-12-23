val number: Int? = null // null이 들어갈 수 있는 변수 -> nullable 하다
//val number2: Int = null // non-null
//println(number)

val number2: Int? = 3 + 5
val number3: Int? = 10

//val number4: Int? = number2 + number3 -> 오류 -> number2가 타입이 ? 라서 이 시점에서 Int라는 보장이 없다.
val number4: Int? = number2!! + number3!! // 컴퓨터한테 null이 아니라고 보장하는 행위
println(number4)

if (null == 5) {  // == 비교연산 가능
    println("same")
} else {
    println("not same")
}

if (null == null) {  // 상태를 비교
    println("same")
} else {
    println("not same")
}
