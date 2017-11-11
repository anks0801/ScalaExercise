package package5

object Function3Recursion {
  def main(args: Array[String]) {
    def factorial(i: BigInt): BigInt = {
      if (i <= 1)
        1
      else
        i * factorial(i -1 )
    }
    println(factorial(4))
  }
}
/*
 * 1st Iteration:4 * factorial(3) = 4 * 6 = 24
 * 2nd Iteration:3 * factorial(2) = 3 * 2 = 6
 * 3rd Iteration:2 * factorial(1) = 2 * 1 = 2
 */