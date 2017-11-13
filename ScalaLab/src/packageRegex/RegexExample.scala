package packageRegex
import scala.util.matching.Regex

object RegexExample {
  def main(args: Array[String]): Unit = {
    val word = "Data".r

    val sentence = "Big Data session on Scala Data"

    println(word findFirstIn sentence)
    
    val pattern = new Regex("(S|s)cala")
    val str = "Scala is scalable and cool"
    println((pattern findAllIn str).mkString(","))
    
    val pattern1 = new Regex("[A-Z]")
    println((pattern1 findAllIn str).mkString(","))
  }
}