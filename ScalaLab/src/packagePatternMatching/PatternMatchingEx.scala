package packagePatternMatching

object PatternMatchingEx {
  def main(args: Array[String]): Unit = {
    println(check(1))
    println(check(3))
    
    
  }
  
  def check(i : Int):String = i match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Other"
  }
}