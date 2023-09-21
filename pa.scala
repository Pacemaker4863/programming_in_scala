@main def m(args: String*) =
  args.foreach(arg => println(arg))
  // args.foreach(println)
  // args.foreach(arg: Strin => println(arg))