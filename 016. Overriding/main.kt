open class A {
    // 상속 구조에서는 오버라이딩(재정의) 개념을 사용할 수 있다
    open fun f() {}
    // 클래스를 open하고, 메소드 f를 open했음
}

class B: A() {
    // class [Name]: Parent() 형태
    override fun f() {
        // override fun [Func_signature]
        // 메소드 오버라이딩
        println("Override function!")

        super.f()
        // 상위 클래스의 메소드 f에 접근
    }
}

fun main(args: Array<String>) {
    B().f()
}
