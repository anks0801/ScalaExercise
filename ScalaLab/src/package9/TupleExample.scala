package package9

object TupleExample {
  def main(args: Array[String]): Unit = {
    var students = (1, "Derek", 18 , "Soccer", "Science")
    
    println(students.toString())
    
    printf("%s is %d years old, in %s department and likes %s .",
        students._2, students._3, students._5, students._4
        )
    
   
  }
}