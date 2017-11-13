package packageClass

object ExtendExample {
  def main(args: Array[String]): Unit = {
    val bmw = new BMW("M4")
    println(bmw.maxSpeed)
    val audi = new Audi("R8 V10")
    println(audi.maxSpeed)
  }
}

abstract class Car(var name: String) {
  var speed: Int
  def maxSpeed: String
}

class BMW(name: String) extends Car(name) {
  var speed = 155
  def maxSpeed = name + " runs with maximum speed of " + speed + "mph"
}

class Audi(name: String) extends Car(name) {
  var speed = 200
  def maxSpeed = name + " runs with maximum speed of " + speed + "mph"
}