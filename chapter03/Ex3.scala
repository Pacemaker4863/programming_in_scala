package dev.iode.nextsteps

object Ex3 {
  def main(args: Array[String]): Unit = {
    val greetStrings: Array[String] = new Array[String](3)
    // greetStrings(0) = "Hello" is transformed in:
    greetStrings.update(0, "Hello")
    greetStrings.update(1, ", ")
    greetStrings.update(2, "world!\n")

    greetStrings.foreach(print)

    val numNames = Array("zero", "one", "two")
    println("numNames.toList [" + numNames.toList + "]")

    val numNames2 = Array.apply("zero", "one", "two")
    println("numNames2.toList [" + numNames2.toList + "]")

    // Use Lists
    val oneTwoThree = List(1, 2, 3)
    println(s"oneTwoThree [${oneTwoThree}]")

    {
      val oneTwo = List(1, 2)
      val threeFour = List(3, 4)
      val oneTwoThreeFour = oneTwo ::: threeFour
      println("oneTwoThreeFour [" + (oneTwoThreeFour) + "]")
    }
    {
      val twoThree = List(2, 3)
      val oneTwoThree = 1 :: twoThree
      println(s"oneTwoThree [${oneTwoThree}]")
    }
    {
      val oneTwoThree = 1 :: 2 :: 3 :: Nil
      println(s"oneTwoThree [${oneTwoThree}]")
    }
    // Use Tuples
    val pair = (99, "Luftballoons")
    val num = pair(0)
    val what = pair(1)
    // Use sets and maps
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    val query = jetSet.contains("Cessna")
    assert(query == false)

    jetSet = jetSet + "Lear"

    import scala.collection.mutable

    val movieSet = mutable.Set("Spotlight", "Moonlight")
    movieSet += "Parasite"
    // movieSet now contains: "Spotlight", "Moonlight", "Parasite"

    import scala.collection.immutable.HashSet

    val hashSet = HashSet("Tomatoes", "Chilies")
    val ingredients = hashSet + "Coriander"
    // ingredients contains "Tomatoes", "Chilies", "Coriander"

    import scala.collection.mutable

    val treasureMap = mutable.Map.empty[Int, String]
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    val step2 = treasureMap(2)
    assert(step2.equals("Find big X on ground."))

    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    val four = romanNumeral(4) // "IV"

    // Learn to recognize the functional style
    def formatArgs(args: List[String]) = args.mkString("\n")

    val res = formatArgs(List("zero", "one", "two"))
    assert(res == "zero\none\ntwo")

    // Transform with map and for-yield
    val adjectives = List("One", "Two", "Red", "Blue")
    val nouns = adjectives.map(adj => adj + " Fish")
    // List(One Fish, Two Fish, Red Fish, Blue Fish)

    {
      // aanother way
      val nouns =
        for adj <- adjectives yield
          adj + " Fish"
    }

    val lengths = nouns.map(nous => nous.length) // List(8, 8, 8, 9)

    {
      val lengths =
        for noun <- nouns yield
          nouns.length
    }
    // List(8, 8, 8, 9)

    val ques = Vector("Who", "What", "When", "Where", "Why")

    val usingMap = ques.map(q => q.toLowerCase + "?")
    // Vector(who?, what?, when?, where?, why?)

    val usingForYield =
      for q <- ques yield
        q.toLowerCase + "?"
    // Vector(who?, what?, when?, where?, why?)

    val startsW = ques.find(q => q.startsWith("W")) // Some(Who)
    val hasLen4 = ques.find(q => q.length == 4) // Some(What)
    val hasLen5 = ques.find(q => q.length == 5) // Some(Where)
    val startsH = ques.find(q => q.startsWith("H")) // None

    startsW.map(word => word.toUpperCase) // Some(WHO)

    for word <- startsW yield word.toUpperCase // Some(WHO)

    startsH.map(word => word.toUpperCase) // None

    for word <- startsH yield word.toUpperCase // NoneO
  }
}