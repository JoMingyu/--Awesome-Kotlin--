fun main(args: Array<String>) {
    // Kotlin에는 대표적인 점프 구문(return, break, continue)에 라벨링 등 문법적인 요소들이 많다
    // 물론 Java에도 있지만 코틀린 측에서는 이 부분을 꽤 밀어주는 듯 하다
    outer@ for (i in 1..100) {
        // 바깥쪽 for에 outer라는 라벨을 붙여 뒀다
        // 이 라벨을 사용해서 break나 continue를 한정할 수 있다
        for (j in 1..100) {
            print(j)

            if (j == 10) {
                break@outer
            }
        }
    }
}
