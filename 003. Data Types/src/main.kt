fun main(args: Array<String>) {
    // 코틀린에서 모든 것은 객체로서, 변수에 대한 메소드나 프로퍼티를 호출할 수 있음
    // 숫자, 문자, 불리언 타입은 내부적으로 기본 값으로 표현되지만, 사용자에게는 일반 클래스처럼 보임
    println(123 + 123L + 0x0F + 0b00000110)
    println(123.5 + 123.5f)
    println(123.toChar())
    // 모든 숫자 타입은 toByte, Short, Int, Long, Float, Double, Char를 지원함

    println(true)
    // Boolean

    println("string!")
    println("1".toInt())
}
