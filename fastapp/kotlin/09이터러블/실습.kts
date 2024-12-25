// Ragne
val rang1 = 1..10
println(rang1)

val range2 = 1 until 10
println(range2)

val range3 = 'A'..'Z'
println(range3)

range3.forEach {
    print(it)
}

// Progresstion
val range4 = 1..10 step 2
println()
println(range4)

val range5 = 10 downTo 1 step 2
println(range5)

//STEP
// - 특징 : step에 값과 상관없이 첫번째는 무조건 index 0 부터 시작

// Collection
val collection1 = listOf<Int>(1, 2, 3, 4, 5)
