class Empty
// 빈 클래스

class Person constructor(name: String)
// 클래스의 생성자. 보조 생성자와 비교하기 위해 '기본(Primary) 생성자'라고 부름

class Person2(name: String) {
    // 접근 제한자가 없다면 constructor 키워드를 생략할 수 있음
    val name_ = name.toUpperCase()
    // 생성자 파라미터를 통해 프로퍼티 초기화

    init {
        // 초기화 블록. init 키워드를 접두사로 붙임
        println("Person2 Initialized!")
    }
}

class Person3(val name: String)
// 생성자 자체에서 프로퍼티를 선언하고 초기화할 수 있는 간결한 구문을 제공하고 있음

class Person4 {
    constructor(name: String)
    // constructor 키워드를 이용해 보조 생성자를 선언할 수 있음
    // 여기서는 기본 생성자에서처럼 var/val 형태의 프로퍼티 선언과 초기화가 불가능
}

class Person5(val name: String) {
    constructor(name: String, age: Int) : this(name)
    // 클래스에 기본 생성자가 있다면 각 보조 생성자는 직접적으로 또는
    // 다른 보조 생성자를 통해 간접적으로 기본 생성자를 호출해야 함
    // 같은 클래스의 다른 생성자를 호출할 때는 this 키워드를 사용
}

class Person6 private constructor()
// 클래스의 생성자는 기본적으로 public이므로 감싸려면 private 처리된 빈 생성자를 만들어야 함

open class A(open val prop: String) {
    // 코틀린의 모든 클래스는 기본적으로 상속 불가능하며(모두 final) Any 클래스를 상속함
    // 클래스, 프로퍼티, 메소드를 상속 가능하게 만드려면 open 키워드를 사용해 주어야 함

    open fun f() {}
    // 클래스를 open하고, prop이라는 프로퍼티와 함수 f를 open했음
}

class B(override val prop: String): A(prop) {
    // 프로퍼티 오버라이딩. 동시에 상위 클래스의 생성자에 파라미터 전달
    override fun f() {
        // 메소드 오버라이딩
        println("Override function!")

        super.f()
        // 상위 클래스의 메소드나 프로퍼티 접근
    }
}

fun main(args: Array<String>) {
    val person = Person3("PlanB")
    // 인스턴스화. new 키워드가 없음
    println(person.name)
    // 프로퍼티 접근

    val b = B("Some property")
    b.f()
}
