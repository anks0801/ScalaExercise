package package7

object List1 {
    def main(args: Array[String]): Unit = {

    val alphabets: List[String] = List("A", "B", "C")

    val numbers = List(1, 2, 3)

    val alphabets2 = "A" :: ("B" :: ("C") :: Nil)

    val numbers2 = 1 :: (2 :: (3 :: Nil))
    
    println(alphabets)
    println(alphabets.apply(0)) 
    println(alphabets(0)) //short way 
    
    //Iterate through each element
    for (i <- alphabets)
      println(i)
      
  }
}