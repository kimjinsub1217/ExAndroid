val numbers = intArrayOf(5, 10, 15)

// 값만 필요함
for (number in numbers) {
    println(number)
}
println("================================")
// 값과 인덱스 모두 필요
for ((index, value) in numbers.withIndex()) {
    println("$index $value")
}

// 인덱스만 필요할 떄
for (index in numbers.indices){
    println(index)
}

numbers.forEach {
    
}

numbers.forEachIndexed { index, i ->

}