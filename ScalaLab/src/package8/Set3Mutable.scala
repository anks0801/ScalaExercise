package package8

object Set3Mutable {
  def main(args: Array[String]): Unit = {
    val set1 = collection.mutable.Set(1)
    print(set1) 
    set1 += 2
    print(set1)
  }

}