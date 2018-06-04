open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    // 클래스나 클래스의 멤버를 abstract로 선언 가능
    // 추상 멤버는 정의만을 가지며 구현을 가질 수 없음
    // 추상 클래스나 메소드에는 open을 붙일 필요가 없다
    override abstract fun f()
    // 이처럼 open function을 오버라이드해서 추상 메소드를 만들 수도 있다
}

class Main : Derived() {
    override fun f() {
        println("Hi!")
    }
}

fun main(args: Array<String>) {
    Main().f()
}
