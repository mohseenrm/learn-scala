package playground

object RecurseFunction extends App {
	def map(base: String, count: Int): String = {
		if (count == 1) base
		else base + " " + map(base, count-1)
	}

	println(map("Hola!", 3))
}
