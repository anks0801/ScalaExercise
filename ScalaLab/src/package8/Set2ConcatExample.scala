package package8

object Set2ConcatExample {
   def main(args: Array[String]): Unit = {
    val set1 = Set("A", "B", "C")
    
    val set2 = Set("D", "E", "Z", "A", "B")
    
    val set3 = set1 ++ set2
    
    println(set3)
    
    //find common values intersect or &
    
    println("common elements in set1 and set2 = " +
        set1.intersect(set2))

  }
}