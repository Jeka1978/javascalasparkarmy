package scala_map_reduce

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val employees = List(Employee(10),Employee(20),Employee(15))
    val totalSalary = employees.map(_.salary).sum
    println(totalSalary)
  }
}
