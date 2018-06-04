fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4)

    for (item in arr) {
        println(item)
    }
    // Iterator를 제공하는 모든 객체에 대해 반복을 수행
    // C#의 foreach, python의 for statement와 동일하다

    arr.forEach {
        println(it)
    }

    for (i in arr.indices) {
        // Index 기반
        print(arr[i])
    }

    for (i in 1..10) {
        // Python의 range(1, 11)과 비슷함
        print(i)
    }
}
