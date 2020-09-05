import forbidden.knowledge.DoNotUseMe

object Main extends App {
  val x = 2 + 2
  Utils.printStuff(x)
  DoNotUseMe.doTheBadThing()
  Utils.printStuff(x)
}