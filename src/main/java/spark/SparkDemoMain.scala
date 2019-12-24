package spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * @author Evgeny Borisov
  */
object SparkDemoMain {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("demo").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(List(1,2,3))

  }
}
