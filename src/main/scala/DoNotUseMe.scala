package forbidden.knowledge

object DoNotUseMe {
  def doTheBadThing() = {
    println(scala.Console.YELLOW + "Warning: doing the bad thing" + scala.Console.RESET)
    val cache = classOf[Integer].getDeclaredClasses.apply(0)
    val c = cache.getDeclaredField("cache")
    c.setAccessible(true)
    val array = c.get(cache).asInstanceOf[Array[Integer]]
    array(132) = array(133)

    // for dramatic effect
    Thread.sleep(1000)
    println(scala.Console.RED + "Th̡e bąd̡ t͡h͟i̵ng͝ h̀a̢s béeņ ̡d̵one" + scala.Console.RESET)
    Thread.sleep(1000)
  }
}