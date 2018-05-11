fun main(args: Array<String>) {
    /*
        코틀린에서 모든 것은 객체로서, 변수에 대한 메소드나 프로퍼티를 호출할 수 있다
        123, 1.0처럼 리터럴 형태의 숫자, 문자, boolean 타입 또한 사용자에게 단순히 값처럼 표현되지만,
        내부적으로는 일반 클래스로 다뤄진다
     */
     
     // -- 숫자
     // 모든 숫자 타입은 아래의 타입 캐스팅을 지원한다
     println(123.toByte())
     println(123.toShort())
     println(123.toInt())
     println(123.toLong())
     println(123.toFloat())
     println(123.toDouble())
     println(123.toChar())

     // -- 문자
     println('P'.toByte())
     println('P'.toChar())
     println('P'.toDouble())
     println('P'.toFloat())
     println('P'.toInt())
     println('P'.toLong())
     println('P'.toShort())

     // -- 문자열
     println("PlanB".toBoolean())
     println("123".toByte())
     println("1.0".toDouble())
     println("1.0".toFloat())
     println("123".toInt())
     println("123".toLong())
     println("123".toShort())
     // toBigDecimal, toBigInteger, toByteArray 등 수많은 캐스팅 메소드가 존재한다
}
