fun main(args: Array<String>) {
    // Kotlin에는 3가지의 점프 식이 있다
    // return : 가장 가까이 둘러싸여진 함수나 익명 함수를 return
    // break : 가장 가까이 둘러싸여진 루프를 끝냄
    // continue : 가장 가까이 둘러싸여진 루프의 다음 단계를 진행
    outer@ for (i in 1..100) {
        // break와 continue에는 라벨을 붙일 수 있다
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
