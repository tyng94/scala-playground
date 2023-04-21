object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    // Defining variables and values
    var variable = 1
    variable = 2
    val value = 3
    // y = 4 // This will result in a compilation error

    // Basic data types
    val i: Int = 1
    val b: Boolean = true
    val d: Double = 3.14
    val s: String = "foo"
    val c: Char = 'a'


    val result = add(1, 2)
    println(result) // Prints 3

    // Control flow
    val x = 5
    if (x > 0) {
      println("positive")
    } else if (x < 0) {
      println("negative")
    } else {
      println("zero")
    }
    for (i <- 1 to 5) {
      println(i)
    }

    var j = 0
    while (j < 5) {
      println(i)
      j += 1
    }
  }

  def add(a: Int, b: Int): Int = {
    a + b
  }
}