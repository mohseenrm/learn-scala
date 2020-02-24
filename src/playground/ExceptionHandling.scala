package playground
import scala.util.{Random, Try, Success, Failure}

object ExceptionHandling extends App {
  val hostname = "localhost"
  val port = "8080"
  def renderHTML(page: String) = println(page)

  class Connection {
    def get(url: String): String = {
      val random: Random = new Random(System.nanoTime())
      if (random.nextBoolean()) "<html>...</html>"
      else throw new RuntimeException("Connection Issue!")
    }
  }

  object HttpService {
    val random = new Random(System.nanoTime())

    def connect(hostname: String, port: String): Connection =
      if(random.nextBoolean()) new Connection
      else throw new RuntimeException("Port in use")
  }

  val connection = try {
    renderHTML(HttpService.connect(hostname, port).get("/"))
  } catch {
    case e: RuntimeException => println(e)
  }
}
