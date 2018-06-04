fun sum(a: Int = 0, b: Int): Int {
    // 함수는 아래의 main 함수처럼 fun 키워드로 선언할 수 있고
    // 함수 시그니처 뒤에 리턴 타입을 명시한다
    // 매개변수에 가본값 설정 가능
    return a + b
}

fun main(args: Array<String>) {
    fun inner() {
        // Inner function 선언 가능
        println("Inner!")
    }

    println(sum(3, 4))
    // 위치 인자

    println(sum(b=3))
    // 키워드 인자

    inner()
}