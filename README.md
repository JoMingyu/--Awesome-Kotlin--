# TIL-Kotlin
코틀린 공부하자

## Remember
#### variable
    var/val [Name]: type
    var num: Int = 5 // Not null
    var str: String? = null // Nullable
    // var : common variable
    // val : read-only

#### class
    class [Name] constructor([Name]: type, [Name]: type, ...) {
        init {
        
        }
    }
    class [Name](...) {
        // Omit constructor keyword
        init {
      
        }
    }
    class [Name] {
        init {
        
        }
    
        constructor(...) {
        
        }
    }
    open class [Name] {
        // Enable enheritance
        init {
        
        }
        
        constructor(...) {
        
        }
    }

#### inheritance
    open class Base {
        var msg: String = ""
        constructor(msg: String) {
            this.msg = msg
        }
    }
    
    class UseBase(msg: String) : Base(msg)
    
    class UseBase2 : Base {
        constructor(msg: String) : super(msg)
    }
    
