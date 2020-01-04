package playground

object Generics extends App {
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // Covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // Invariance
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  // Contra-variance
  class ContraVariantList[-A]
  val contraVariantList: ContraVariantList[Cat] = new ContraVariantList[Animal]

  // bounded types: <: for subtypes
  // >: for super types
  class Cage[A <: Animal](animal: A)
  val dogCage = new Cage(new Dog)
  val catCage = new Cage(new Cat)
}