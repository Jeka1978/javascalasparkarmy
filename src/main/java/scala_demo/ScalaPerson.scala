package scala_demo

/**
  * @author Evgeny Borisov
  */
class ScalaPerson(var name: String = "Moshe", age: Int = 0) {

  init()

  private def init():Unit={
   println(name)
    println(age)

  }

  def printMyAge(x:Int=2): Unit = {
    println(age)
  }


}
