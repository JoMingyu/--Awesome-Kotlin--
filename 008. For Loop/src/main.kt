fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4)

    for (item in arr) {
        println(item)
    }

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
