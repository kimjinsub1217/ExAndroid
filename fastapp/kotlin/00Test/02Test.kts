//1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
fun repeatText(repeatText: String, repeatNumber: Int) {
//    for (i in 0..repeatNumber - 1) println(repeatText)
    for (i in 0 until repeatNumber) println(repeatText)
}
//repeatText("안녕", 2)

fun sumUntil(givenNumber: Int): Int {
    var sum: Int = 0
    for (i in 1..givenNumber) sum += i
    return sum
}
sumUntil(10)

fun sum7s(): Int {
    var sum: Int = 0
    for (i in 0..100) {
        if (i % 7 == 0) {
            sum += i
        }
    }
    return sum
}
//sum7s()

fun increaseOne(numberUnder100: Int) {
    var givenNumber: Int = numberUnder100
    while (givenNumber < 100) {
        println("up")
        givenNumber++
    }
}
//increaseOne(99)

fun checkPassOrNot(examScores: List<Int>): BooleanArray {
    val resultArray = BooleanArray(examScores.size, { false })
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
    }
    return resultArray
}

//val result = checkPassOrNot(listOf<Int>(100, 71, 72, 77, 78, 79, 80, 82, 90, 99))
//result.forEach {
//    println(it)
//}

fun findSumInSixFromDice(): List<List<Int>> {
    val resultList = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) {
                val temp = listOf<Int>(i, j)
                resultList.add(temp)
            }
        }
    }
    return resultList
}
println(findSumInSixFromDice())

fun eatUntilNothugry(totalCount: Int, currentCount: Int) {
    var currentCountCopy: Int = currentCount
    do {
        println("밥을 먹었다.")
        currentCountCopy++
    } while (currentCountCopy < totalCount)
    println("배가 부르다.")
}
eatUntilNothugry(10, 5)

