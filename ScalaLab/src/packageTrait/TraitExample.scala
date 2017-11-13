package packageTrait

object TraitExample {
  def main(args: Array[String]): Unit = {
    val eagle = new Bird("Eagle")
    println(eagle.fly)
    println(eagle.move)
    println(eagle.greet)
    
    val drone = new Drone("Drone") with Moveable
    println(drone.greet)

  }
}

trait Moveable { 
  val name : String
  def greet() = "Hello, I am " +name + " and I can move"
  def move: String
}

trait Flyable {
  val name : String
  def fly: String
}

class Bird(val name: String) extends Moveable with Flyable {
  def fly = "%s flies so high".format(name)
  def move = name + " moves not so fast."
}

class Machine(name :String ){
}

class Drone(val name:String) extends Machine(name){
  def move = name + " can move and capture images."
}
