// 네이밍은 자바의 컨벤션을 기본으로 함
// 1. 이름은 camel case 사용
// 2. class, interface 등 타입은 pascal case 사용
// 3. 메소드, 프로퍼티는 소문자로 시작
// 4. 4개의 공백으로 들여씀

open class A

class B : A() {
    // 콜론이 타입과 하위 타입을 구분한다면 양 쪽에 공백
    fun f(a: Int): Int {
        // 인스턴스와 타입을 구분한다면 뒤쪽에만 공백을 넣도록 함
        return a
    }
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)

    list.filter { it > 3 }.map { element -> element * 2 }
    // 람다식 안에서 중괄호 주변에 공백을 사용하고, 화살표 앞뒤로 공백을 넣음. 가능하면 람다를 괄호 밖에 전달
}

fun f() {
    // 함수가 Unit을 리턴한다면 리턴 타입을 생략한다
}
