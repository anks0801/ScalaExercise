package package8

object Set1 {
   def main(args: Array[String]): Unit = {
    var set1 = Set(1,3,5,7, 7) 

    var set2 : Set[Int] = Set(1,3,5,7)
    
    println(set1) //no duplicates
    
    println("Head: "+ set1.head)
    println("Tail: "+ set1.tail)
    println("Maximum :" +set1.max)
    println("Minimum :" +set1.min)
    
  }
}