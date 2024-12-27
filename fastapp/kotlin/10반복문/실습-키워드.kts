//break
for (i in 1..3) {
    println("i: " + i)
    for (j in 1..3) {
        if (j == 2) break
        else println("j :" + j)
    }
}

println("-------------")
// continue
for (i in 1..3) {
    println("i: " + i)
    for (j in 1..3) {
        if (j == 2) continue
        else println("j :" + j)
    }
}
println("-------------")
// return
fun returnFun() {
    for (i in 1..3) {
        println("i: " + i)
        for (j in 1..3) {
            if (j == 2) return
            else println("j :" + j)
        }
    }
}
returnFun()

println("-------------")
loop@ for (i in 1..3) {
    println("i: " + i)
    for (j in 1..3) {
        if (j == 2) break@loop
        else println("j :" + j)
    }
}
// foreach는 continue와 break 사용 불가
listOf(1, 2, 3).forEach loop@{
    if (it == 2) return@loop
    else println(it)

}