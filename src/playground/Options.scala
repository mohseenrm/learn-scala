package playground

import scala.util.Random

object Options extends App {
  val testOption: Option[Int] = Some(55)
  val noValue: Option[Int] = None

  println(testOption)

  def unSafeMethod(): String = null
  val result = Option(unSafeMethod())
  println(result)

  def fallbackResult(): String = "Valid Result"
  val callUnSafeMethod = Option(unSafeMethod()).orElse(Option(fallbackResult()))
  println(callUnSafeMethod)

  class Connection {
    def connect = "Connected!"
  }

  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }

  val config: Map[String, String] = Map(
    "host" -> "127.0.0.1",
    "port" -> "4455"
  )

  val connectionStatus = for {
    host <- config.get("host")
    port <- config.get("port")
    connection <- Connection(host, port)
  } yield connection.connect

  println(connectionStatus)
}
