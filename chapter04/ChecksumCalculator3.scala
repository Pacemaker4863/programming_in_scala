package dev.iode.classesandobjects

object Ex3 {
  class ChecksumAccumulator:
    private var sum = 0

    // better to explicitly provide the result
    //types of public methods declared in a class even when the compiler would
    //infer it for you
    def add(b: Byte) /*: Unit*/ = sum += b
    def checksum() /*: Int*/ = ~(sum & 0xFF) + 1

  def main(args: Array[String]): Unit = {
    val calc = new ChecksumAccumulator
    calc.add(3)

    println("calc.checksum [" + calc.checksum() + "]")
  }
}