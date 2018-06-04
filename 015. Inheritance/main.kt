open class A {
    // 코틀린의 모든 클래스는 기본적으로 상속 불가능하며(Java로 치면 모두 final) Any 클래스를 상속함
    // 클래스, 프로퍼티, 메소드를 상속 가능하게 만드려면 open 키워드를 사용해 주어야 함

    fun f() {
        println("Hi!")
    }
}

class B: A() {
    // class [Name]: Parent() 형태
    // 위처럼 오버라이딩된 프로퍼티가 존재한다면 부모 클래스의 생성자에 넘겨주어야 함
}

fun main(args: Array<String>) {
    B().f()
}
