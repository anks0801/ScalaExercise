package package2

object IfElseNested {
  def main(args: Array[String]): Unit = {
    var a = 2

    if (a == 1) {
      println("This is if statement")
    } else if (a == 2) {
      println("This is nested statement")
    } else {
      println("This is else statement")
    }
  }
}