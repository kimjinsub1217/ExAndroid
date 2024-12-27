// getter/setter

class Book() {
    var title: String = "모름"
        get() {
            return "책 제목"
        }
        set(value) {
            println(value)
            field = value
        }
}

//val book = Book()
//println(book.title)
//book.title = "제목 변경"

class Book2() {
    lateinit var title: String
    fun nextPage() {
        if (::title.isInitialized == true)
            println("페이지가 넘어감")
        else
            println("초기화 필요")
    }
}

val book = Book2()
println(book.nextPage())

// Lazy
// - 호출시점에 by lazy 정의에 의해서 초기화 수행
// - val 에서만 사용이 가능

class Book3 {
    val title: String by lazy {
        // 본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업
        println("lazy 초기화")
        "책 제목"
    }
}

val book3 = Book3()
println(book3.title)
