package package5

//Create a list of integers
//Create a method to print the sum of all integers in a list 
//Create a method to print the sum of all integers above 35
//Create a method to print the sum of all integers below 35
// below 40 and above 20



object ExercisePackage6 {
  def main(args: Array[String]): Unit = {
    val numbers = List(10, 20, 30, 40, 50)
    //println(total(numbers))
    //println(totalBelow35(numbers))
    //println(totalWithSelector(numbers, {abc => true}))
    ///println(totalWithSelector(numbers, {i => i > 35}))
    println(totalWithSelector(numbers, {num => num < 35}))
  }
  

  
  

  def total(numbers: List[Int]) = {
    var sum = 0
    for (i <- numbers) {
      sum += i
    }
    sum
  }

  
  
  
  
  def totalOver35(numbers: List[Int]) = {
    var total = 0
    for (num <- numbers) {
      if (num > 35)
        total += num
    }
    total
  }

  
  
  def totalBelow35(numbers: List[Int]) = {
    var total = 0
    for (num <- numbers if num < 35 ) {
       total += num
    }
    total
  }
  
  
  
  //Advanced Scala way
  def totalWithSelector(numbers: List[Int], selector: Int => Boolean) = {
    //selector is a type of function which 
    var total = 0
    for (num <- numbers) {
      if(selector(num))
      total += num
    }
    total
  }
  

}