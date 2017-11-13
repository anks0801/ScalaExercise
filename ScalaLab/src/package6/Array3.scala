package package6

object Array3 {
  def main(args: Array[String]): Unit = {
    var array3 = Array(2,10,5,8,4,9,3)
    
    println("unsorted:" +array3.deep.mkString(","))
    
    var sorted = array3.sortWith(_<_) //ascending sort
    
    println("sorted:" +sorted.deep.mkString(","))
   
  }
}