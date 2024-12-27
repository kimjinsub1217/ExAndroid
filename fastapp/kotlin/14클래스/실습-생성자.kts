// 클래스를 선언하는 방법
class Person {}

// 주생성자
class User1 constructor(name: String) { // 클래스 네이밍은 대문자로 시작
    val userName: String // 클래스 변수 (프로퍼티,property)

    init { // 클래스가 생성될때 호출
        println(name)
        userName = name
    }
}
// 클래스 호출 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화
// 객체 -> Object, Instance
val user = User1("짱구")

// 주생성자 init 생략
class User2 constructor(name: String) {
    val userName: String = name
}

val user = User2("철수")

// 주생성자 constructor 생략
class User3(name: String) {
    val userName: String = name
}

val user = User3("유리")

// 주생성자 -> 기본값
class User4(name: String = "훈이") {
    val userName: String = name
}

val user = User4()

// 생성자에서 받는 속성이 복수개인경우
class User5 constructor(age: Int, name: String) {
    val age: Int // 클래스 속성
    val name: String

    init {
        this.age = age // this는 클래스 자체를 의미한다
        this.name = name
    }
}

// .의미 -> ~의
// 객체의 속성이나 기능을 사용할때 사용
val user5 = User5(5, "맹구")
println(user5.name)

// 주생성자 -> 간소화
class User6(val userName: String) {

}

// 부생성자 (Secondary Constructor)
// constructor 키워드 생략할 수 없다
// 주생성자에는 객체를 만들기 위한 필수 조건 , 부생성자는 객체를 만들기 위한 옵션 조건
// 부생성자에서는 주생성자에서 필요한 조건을 포함하고 있어야 한다.
// 부생성자는 주생성자에게 생성을 위임한다.
class User7 constructor(name: String) {
    var age: Int = 0
    val name: String

    init {
        this.name = name
    }

    // 부생성자는 클래스명 우측에 올 수 없다 -> 클래스 본문에 있어야 한다.
    constructor(name: String, age: Int) : this(name) {
        this.age = age

    }
}

val user7 = User7("떡잎")
println(user7.name)

val user7_2= User7("떡잎",5)
println(user7_2.age)

