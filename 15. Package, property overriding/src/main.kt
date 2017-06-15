import sample.Student

fun main(args: Array<String>) {
    var student = Student("name", 17)
    var student2 = Student("name", 18, 3)

    println("${student.name}, ${student.age}")
    println("${student2.name}, ${student2.age}, ${student2.grade}")
}
