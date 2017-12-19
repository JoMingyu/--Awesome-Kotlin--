fun sum(a: Int, b: Int): Int {
    // 변수명: 타입, 함수 정의는 fun 키워드
    // 리턴 타입은 함수 정의 블록 이전에

    return a + b
}

fun sum2(a: Int, b: Int) = a + b
// expression body를 사용하고, 리턴 타입을 추론

fun printSum(a: Int, b: Int): Unit {
    // 의미없는 값을 리턴하는 함수. Unit 리턴 타입은 생략 가능

    println(a + b)
}

fun main(args: Array<String>) {
    // 메인 함수 정의. 클래스 level 안에 있어야 한다는 제약이 없음

    val a: Int = 1
    // val은 읽기 전용 변수. 값을 한 번만 할당 가능
    val b = 2
    // Int 타입으로 추론
    val c: Int
    // 초기화를 하지 않는다면 타입 필요

    var x = 5
    // 변경 가능 변수. 여기서도 Int 타입으로 추론

    println("x is $x")
    // 출력. 문자열 템플릿 사용
}
