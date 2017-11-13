package package7

object List6Mutable {
  def main(args: Array[String]): Unit = {
    val buf = scala.collection.mutable.ListBuffer.empty[Int]
    buf += 1
    buf += 4
    buf += 5
    println(buf)
    
    val bufString = scala.collection.mutable.ListBuffer.empty[String]
    bufString += "a"
    bufString += "b"
    bufString += "c"
    //remove element
    //bufString -= "a"
    //bufString.remove(2)
    println(bufString)
  }
}