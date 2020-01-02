package playground

class Person (val name: String, favoriteMovie: String) {
  def +(person: Person): String = {
    s"${this.name} is meeting with ${person.name}"
  }
}

object MethodNotations extends App {
  val momo = new Person("Mohseen", "Godfather")
  val panda = new Person("Utkarsh", "Dil mil")

  println(momo + panda)
}