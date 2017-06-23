annotation class Hello

@Target(AnnotationTarget.TYPE)
@Retention(AnnotationRetention.RUNTIME)
annotation class Good

annotation class Nice(
        val message: String
)

@Hello @Nice("okok") fun main(args: Array<String>) {

}
