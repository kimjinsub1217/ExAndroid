//List
val numbers = listOf<Int>(1, 2, 3)
println(numbers)

val numbers2 = mutableListOf<Int>(1, 2, 3)
numbers2[0] = 2
println(numbers2)

//Set
val number3 = setOf<Int>(1, 1, 1, 3, 3, 4)
val number4 = mutableSetOf<Int>(1, 1, 1, 3, 3, 4)
println(number3)

//Map
val numbers5 = mapOf<Int, String>(1 to "one", 2 to "two")
val numbers6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))
println(numbers5)
println(numbers6)