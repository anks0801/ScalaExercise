package package7

object List3 {
  def main(args: Array[String]): Unit = {

    val alphabets: List[String] = List("A", "B", "C")

    val numbers = List(1, 2, 3)

    val alphabets2 = "D" :: ("E" :: ("F") :: Nil)

    val numbers2 = 4 :: (5 :: (6 :: Nil))

    //Concatenation
    val allNumbers = numbers ::: numbers2
    val anyList = alphabets ::: numbers
    
    println("allNumbersList  = " +allNumbers)
    println("anyList  = " +anyList)
  }
}