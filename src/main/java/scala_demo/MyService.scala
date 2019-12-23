package scala_demo

/**
  * @author Evgeny Borisov
  */
object MyService {
  init()

  private def init(): Unit = {
    println("Service was started up")
  }

  def apply():Unit={
    println("processing....")
  }


}
