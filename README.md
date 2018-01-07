# TIL-Kotlin
OOP Language with Concise Syntax based JVM

## Kotlin
JetBrains에 의해 만들어진 JVM 기반의 객체지향 프로그래밍 언어. Java에 비해 간결한 문법을 자랑하며 특히 안드로이드에서 자바의 보일러플레이트를 확실하게 제거해 준다. 데이터 타입을 Nullable과 NotNull로 나누며, 오버헤드 없는 널 안정성을 제공한다. 예외를 검사하지 않으며 연산자 오버로딩을 지원하고, Higher Order Function 기법을 통해 함수형 프로그래밍이 가능하며, == 연산자가 생각하는 대로 작동한다. DTO 정의 시 data class를 사용하며 클래스와 메소드는 기본적으로 상속 불가능한 상태로 관리된다. 반복문에 for-in-range 형식을 사용하고 switch-case 대신 when expression을 사용한다.

2017년 Google I/O 행사에서 안드로이드의 공식 언어로 채택되었다는 발표 이후로 굉장히 빠르게 발전하고 있으며, <a href="https://academy.realm.io/kr/posts/android-kotlin/?_ga=2.51757353.1026077174.1513562032-1956003605.1513562032">Android는 새 언어가 필요할까? Kotlin</a>에서 코틀린을 소개했던 때에 비하면 비교할 수 없을 정도로 많은 리소스들이 생겨났다. Android Studio에서도 버전 3.0 릴리즈와 함께 Kotlin을 공식적으로 지원한다.

JVM 기반으로 동작하기 때문에 기존의 Java 코드를 쉽게 Kotlin으로 옮길 수 있다. 그러나 반대로 Kotlin을 Java로 옮기는 일은 생각보다 힘드니 레거시 코드를 변경할 경우 주의가 필요하다. 여기서 Kotlin을 다룰 때에는 많은 부분을 Java와 비교하며 진행하려고 한다.

## 안드로이드를 위한 코틀린
Kotlin Reference에서는 '서버사이드를 위한 코틀린'도 소개하고 있으나 별로 관심 없으니 코틀린이 주인공인 안드로이드를 살펴보도록 하자. Kotlin이 있다면, 현대 언어의 장점을 새로운 제약 없이 안드로이드 플랫폼에 도입할 수 있다.

먼저 코틀린은 JDK 6과 완전히 호환된다. 오래된 버전의 안드로이드 장비에서도 문제없이 코틀린 마이그레이션이 가능하다. 또한 자바와 매우 유사한 바이트코드 구조를 가지고 있기 때문에 동일한 자바 어플리케이션만큼 빠르고, 종종 람다를 사용한 코드가 자바로 작성한 코드보다 더 빠를 때도 있다.

자바와 상호운용도 가능하기 때문에, 기존의 안드로이드 라이브러리를 코틀린에서 사용할 수 있다. 어노테이션 처리도 포함되므로 Data binding과 디버깅도 잘 동작한다.

코틀린 팀에서는 표준 Kotlin 특징 이상을 지원하는 Kotlin Android Extension를 제공하는데, findViewById() 호출을 제거하고 컴파일러가 생성한 합성 프로퍼티로 대체하거나, onClickListener를 간결화하는 등의 역할을 해 준다.

## Related
<a href="http://kotlin.kr/">Kotlin Korea</a>  
<a href="https://kotlinlang.org/docs/reference/">Kotlin Reference</a>  
<a href="http://kotlinlang.org/docs/tutorials/">Kotlin Tutorials</a>  
<a href="http://javacan.tistory.com/466">Kotlin Reference 한글 번역본</a>
