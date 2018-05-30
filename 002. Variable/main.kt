fun main(args: Array<String>) {
    /*
        Kotlin에서는 변수를 선언하기 위해 var와 val를 사용할 수 있고
        val는 read-only를 의미함(최초 1회만 초기화 가능)
     */
    
    // -- val
    val a: Int = 1
    /*
        가장 일반적인 형태의 변수 선언식
        [var|val] [name]: [type] = [value]
        read-only int 변수인 a를 초기값 1과 함께 선언
     */

    val b = 2
    // Int 타입 추론

    val c: Int
    // 초기화가 없다면 타입 필요

    c = 3

    // -- var
    var x = 5
    // 타입 추론

    x += 1
    // 변경 가능
}
