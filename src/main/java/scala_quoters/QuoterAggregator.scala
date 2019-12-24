package scala_quoters

/**
  * @author Evgeny Borisov
  */
class QuoterAggregator(quoters: List[Quoter]) {

  def sayAllQuotes():Unit={
    quoters.foreach(_.sayQuote())
  }
}
