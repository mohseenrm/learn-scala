package playground

import scala.annotation.tailrec


object TailEndRecursion extends App {
	def factorial(value: Int): Int = {
		if (value <= 1) 1
		else value * factorial(value-1)
	}

	println(factorial(5))

	def tailEndFactorial(value: BigInt): BigInt = {
		@tailrec
		def helper(x: BigInt, accumulator: BigInt): BigInt = {
			if (x <= 1) accumulator
			else helper(x-1, accumulator * x)
		}

		helper(value, 1)
	}

	println(tailEndFactorial(25000))
}
