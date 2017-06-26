# TIL-Kotlin

## 눈에 띄었던 자바와의 차이점
1. 자바와 비교하면 눈물날 정도로 간결한 문법을 제공
2. 데이터 타입을 Nullable과 NotNull로 나누며 오버헤드 없는 널 안정성(Null Safety) 제공
3. 예외를 검사하지 않음(try-catch 없는 코드)
4. 연산자 오버로딩 지원
5. Higher Order Function의 개념을 통해 함수형 프로그래밍 가능
6. == 연산자가 생각하는 대로 작동(Java의 equals와 같음). 자바의 ==를 쓰려면 ===로, !=는 !==로 표현
7. Static 메소드가 없고 companion object 블럭으로 감싼다
8. DTO 정의 시 data class 키워드 사용
9. @interface 대신 annotation class
10. @Override 대신 override fun
11. 반복문에 for-in-range 형식 사용
12. switch-case 대신 when expression
13. 인스턴스화 과정에서 new 키워드가 필요 없음
14. String에서 변수의 값을 쉽게 표현할 수 있는 interpolation($)을 지원함
