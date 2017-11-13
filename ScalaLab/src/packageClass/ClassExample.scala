package packageClass

object ClassExample {
  def main(args: Array[String]): Unit = {
    val employee1 = new Employee("Carol", "Manager")
    println("Employee Name: " +employee1.name)
    println("Employee Designation: " +employee1.designation) 
    
    val student1 = new StudentClass("Derek", "Mathematics")
    printf("%s studies %s", student1.name, student1.subject)
  }
}



class Employee(var name: String, var designation:String) {
  
}