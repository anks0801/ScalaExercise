package package3

/*Create a list of 5 integers
 * and print the sum of all the numbers
 *
 * */


object ExerciseFoldLeft {
  
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    var sum = 0
    //basic

    for (i <- numbers) {
      sum += i
    }
    println(sum)
    
    
    //advanced
    
    println(numbers.foldLeft(0) { (c, e) => c + e })
    //lambda expression
    
    
    //c - carryover
    //e -element

  }
}