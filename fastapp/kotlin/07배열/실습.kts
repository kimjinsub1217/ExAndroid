// 배열을 선언하는 방법(1)
var array1 = arrayOf(true, "Hi", 10, 2.2)
println(array1)

var array2 = arrayOf<Int>(1, 2, 3, 4, 5)
println(array2)

var array3 = intArrayOf(1, 2, 3, 4, 5)
println(array3)

// 배열을 선언하는 방법(2)
var array4 = Array(10, { 0 })
println(array4)
println(array4[0])

var array5 = IntArray(10, { 1 })
println(array5)
println(array5[1])

// 배열을 선언하는 방법 (3)
var array6 = Array<Int>(10, { 0 })
var array7 = Array<String>(10, { "" })

var array8 = arrayOf<Int>(10, 20, 30, 40)
println(array8[2])
println(array8.get(2))

array8[0] = 100
println(array8[0])

array8.set(0, 200)
println(array8[0])


// 배열의 인자로 변수를 넣는 방법 / 배열의 값을 변수의 값으로 할당하는 방법
val examScore1: Int = 100
val examScroe2: Int = 90
val examScore3: Int = 80
var examScroes = arrayOf<Int>(examScore1, examScroe2, examScore3)

val examScore4 = examScroes[0]
println(examScore4)