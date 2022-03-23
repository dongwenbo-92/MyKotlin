package ch01.taste

data class Person(val name: String,                   // 1 数据类
                  val age: Int? = null)               // 2 可为空的类型(Int?)；变量声明的默认值

fun main(args: Array<String>) {                       // 3 顶层函数    
    val persons = listOf(
        Person("Alice"),
        Person("Bob", age = 29)
    )                                                 // 4 命名声明

    val oldest = persons.maxByOrNull { it.age ?: 0 }  // 5 lambda表达式；elvis操作符
    println("The oldest is: $oldest")                 // 6 字符模板
}

// The oldest is: Person(name=Bob, age=29)            // 7 自动生成`toString`方法