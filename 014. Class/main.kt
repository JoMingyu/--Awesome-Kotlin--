class Empty
// 빈 클래스

class Person constructor(name: String)
// Kotlin의 클래스는 기본 생성자와 한 개 이상의 보조 생성자를 가질 수 있음
// 기본 생성자는 클래스 헤더의 한 부분으로 클래스 이름 뒤에 위치
// 기본 생성자는 어떤 코드도 포함할 수 없음

class Person2(name: String) {
    // 기본 생성자에 어노테이션이나 접근 제한자가 없다면 constructor 키워드를 생략할 수 있음

    init {
        // 초기화 블록. init 키워드를 접두사로 붙이며 객체 생성 시 가장 먼저 실행됨
        println("Person2 Initialized! : $name")
        // 초기화 블록에서 기본 생성자의 파라미터를 사용할 수 있음
    }
}

class Person3 {
    constructor(name: String) {
        println("Person5 constructor called!")
    }
    // constructor 키워드를 이용해 보조 생성자를 선언할 수 있음
}

class Person4(name: String) {
    constructor(name: String, age: Int) : this(name)
    // 클래스에 기본 생성자가 있다면 각 보조 생성자는 직접적으로 또는 다른 보조 생성자를 통해 간접적으로 기본 생성자를 호출해야 함
    // 같은 클래스의 다른 생성자를 호출할 때는 this 키워드를 사용
}

class Person5 private constructor()
// 클래스의 생성자는 기본적으로 public이므로 감싸려면 private 처리된 빈 생성자를 만들어야 함

fun main(args: Array<String>) {
    val person = Person2("PlanB")
    // 인스턴스화. new 키워드가 없음
}
