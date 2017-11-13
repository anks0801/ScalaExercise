package package7

object List5 {
  def main(args: Array[String]): Unit = {
    val diffList = List(1,2,3,4) diff List(2,3)
    //println(diffList)
    
    val personList = List(("Alice",30), ("Bob",35), ("Carol",32))
   // println(personList(0)._1)
    
    def findByName(name:String) = 
      personList.find(_._1 == name).getOrElse(("Not Found",0))
   
    val findALice = findByName("Alice")   
  
    println("Alice's age : " + findALice._2)
  }
}