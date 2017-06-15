package sample

open class Person {
    constructor()
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        println("${this.name}, ${this.age} Initialized")
    }

    open var name: String = ""
        get() = field
        set(value) {
            field = value
        }
    open var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

class Student: Person {
    override var name: String
        get() = super.name
        set(value) {
            super.name = value
        }
    override var age: Int
        get() = super.age
        set(value) {
            super.age = value
        }
    var grade: Int = 0
        get() = field
        set(value) {
            field = value
        }


    constructor(name: String, age: Int): super(name, age)
    constructor(name: String, age: Int, grade: Int) {
        this.name = name
        this.age = age
        this.grade = grade
    }
}
