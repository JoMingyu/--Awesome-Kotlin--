fun main(args: Array<String>) {
    // IntArray, DoubleArray, LongArray 등 데이터 타입마다 Array 데이터형이 있으며 제네릭 형태도 제공됨
    val arr = arrayOf(1, 2, 3, 4)
    // Array<T>를 반환

    arr.iterator().forEach { println(it) }
    println(arr[2])
    // 코틀린의 array는 컬렉션에 가깝지만 연산자 오버로딩 지원 덕분에 인덱싱도 가능함
}
