package package4

object PrintFormat {
  def main(args: Array[String]): Unit = {
    val name = "Carlos"
    val age = 30
    val weight = 70.5

    println(s"My name is : $name")

    println(s"My age after 5 years will be : ${age +5}")
    
    println(f"My weight is : $weight%.3f" )
    
    printf("'%10s'\n", name)
    
    printf("'%10d'\n", age)
    
     printf("'%.5f'\n", weight)
  }

}