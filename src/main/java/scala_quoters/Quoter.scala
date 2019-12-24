package scala_quoters

/**
  * @author Evgeny Borisov
  */
trait Quoter {
  registerMySelf()

  private def registerMySelf():Unit={
    QuoterAggregator.registerNewQuoter(this)
  }
  def sayQuote():Unit
}
