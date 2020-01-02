package playground

class Person (val name: String, favoriteMovie: String, val age: Int = 0) {
  def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
  def unary_+ : Person = new Person(name, favoriteMovie, age+1)

  def learns(language: String): String = s"$name learns $language"
  def learnsScala: String = this learns "Scala"

  def apply(times: Int): String = s"$name watched $favoriteMovie $times times"
}

object MethodNotations extends App {
  val mohseen = new Person("Mohseen", "Godfather")
  // val panda = new Person("Utkarsh", "Dil mil")
  val momo = mohseen + "momo"

  // Get new person with added nickname
  println(momo.name)
  // Get new person with incremented age
  println((+momo).age)

  println(momo learns "Scala")
  println(momo learnsScala)
  // Overload the apply operator
  println(momo(3))
}