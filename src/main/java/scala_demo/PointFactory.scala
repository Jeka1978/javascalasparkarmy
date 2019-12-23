package scala_demo

/**
  * @author Evgeny Borisov
  */
object PointFactory {

  def apply(x: Int, y: Int):Point = {
      new Point(x, y)
  }
}
