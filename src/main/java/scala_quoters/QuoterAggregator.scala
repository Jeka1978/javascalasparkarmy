package scala_quoters

/**
  * @author Evgeny Borisov
  */
object QuoterAggregator {
  private var quoters: List[Quoter] = Nil

  def registerNewQuoter(quoter: Quoter): Unit = {
    quoters = quoter :: quoters
  }

  def sayAllQuotes(): Unit = {
    quoters.foreach(_.sayQuote())
  }
}
