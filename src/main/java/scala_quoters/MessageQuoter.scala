package scala_quoters

/**
  * @author Evgeny Borisov
  */
case class MessageQuoter(message:String) extends Quoter {
  override def sayQuote(): Unit = println(message)
}
