class Person {
    val name: String
    val age: Int
    // 클래스는 프로퍼티를 가질 수 있다
    // Java에서의 필드를 대체

    init {
        name = "PlanB"
        age = 19
    }
    // 프로퍼티는 리터럴, init 블럭, 또는 생성자에서 무조건 초기화되어야 함
}

class Person2(val name: String, val age: Int)
// 생성자 자체에서 프로퍼티를 선언하고 초기화할 수 있는 간결한 구문을 제공하고 있음

class Person3(val name: String) {
    constructor(name: String, age: Int) : this(name)
    // 보조 생성자에서 기본 생성자를 호출하며 프로퍼티에 값 전달
}

open class A(open val prop: String)
// 프로퍼티를 오버라이딩 가능하도록 open

class B(override val prop: String /* 프로퍼티 오버라이딩 */): A(prop)
// 위처럼 오버라이딩된 프로퍼티가 존재한다면 부모 클래스의 생성자에 넘겨주어야 함

fun main(args: Array<String>) {
    val person = Person2("PlanB", 19)

    println(person.name)
    println(person.age)
    // 프로퍼티 접근
}