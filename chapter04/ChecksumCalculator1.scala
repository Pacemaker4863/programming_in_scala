package dev.iode.classesandobjects

object Ex1 {
  class ChecksumAccumulator {
    var sum = 0
  }

  def main(args: Array[String]): Unit = {
    val calc = new ChecksumAccumulator
    println("calc.sum [" + calc.sum + "]")
  }
}