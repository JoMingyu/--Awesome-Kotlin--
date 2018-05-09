fun main(args: Array<String>) {
    // Kotlin의 기본 데이터 타입은 크게 숫자, 문자, 문자열, Boolean으로 나눌 수 있다
    
    // -- 숫자
    val d: Double = 1.5
    // 실수를 다룰 때 기본적으로 Double이 사용되며
    // 위와 같은 일반적인 형태의 실수 리터럴, 또는 e 표기법을 사용할 수 있다
    val d2 = 1.532E15
    
    val f: Float = 1.5f
    // 실수 리터럴 뒤에 f나 F를 표기하는 형태로 float을 표현한다

    val l: Long = 12345L
    // 정수 리터럴 뒤에 L을 표기하는 형태로 long을 표현한다

    val i: Int = 2147483647
    // 숫자 상수의 가독성을 높이기 위해 밑줄을 사용할 수 있다
    val i2: Int = 2_147_483_647

    val s: Short = 65535
    val b: Byte = 255

    // -- 문자
    val c: Char = 'P'
    // Char 타입으로 문자를 표현하며, 즉시 숫자로 다룰 수는 없다

    // -- 문자열
    val str: String = "PlanB"
    // String 타입으로 문자열을 표현하며, 인덱싱 가능하다
    println(str[3])

    // -- Boolean
    val bool: Boolean = true
    // true나 false를 가질 수 있다
}
