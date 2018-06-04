fun main(args: Array<String>) {
    // When 절은 C나 Java같은 언어의 switch 표현에 해당됨
    val v = 20

    when(v) {
        1, 2 -> println("1 or 2")
        // 조건을 콤마로 묶을 수 있음
        in 3..13 -> println("between 3 and 13")
        // in, !in, 범위, 컬렉션을 사용해서 값 검사
        is Int -> println("int")
        // is, !is로 타입 여부 확인
        else -> println("else")
    }
    // 특정 브랜치의 조건을 충족할 때까지 순차적으로 확인
    // 모든 when 브랜치가 충족하지 않으면 else 브랜치를 평가
}
