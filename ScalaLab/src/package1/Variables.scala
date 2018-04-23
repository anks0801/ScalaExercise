package package1

object Variables {
  def main(args: Array[String]): Unit = {
    println("Variable declaration method:" + varDeclaration())
    println("Value declaration method:" + valDeclaration())
    println("Variable Declaration types" + varDeclaration())
  }

  
  //variable declaration
  def varDeclaration(): String = {
    var x: String = "Hello"
    return x
  }

  //value declaration
  def valDeclaration(): String = {
    val y: String = "Hi"
    y
  }
  
  def variableDeclarationtypes(){
    var a :Int = 10
    val b :String = "with datatype declaration."
    var c = 20
    val d = "without datatype declaration."
  }
}