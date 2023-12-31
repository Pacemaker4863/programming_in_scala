package dev.iode.nextsteps

object Ex1 {
  def main(args: Array[String]): Unit =
    val big = new java.math.BigInteger("12345")
    println("big [" + (big) + "]")

    val greetStrings: Array[String] = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    for i <- 0 to 2 do print(greetStrings(i))
}