/**
 * ================================================
 * Garden Gnomes
 *
 *    /\
 *   ('')
 * __{__}__   /\
 *        |  (oo)
 *        |__{__}__   /\
 *                |  (xx)
 *                |__{__}__
 * ================================================
 */


fun main() {
    println("Gnomes")
    println("------------------------")

    val jim = Gnome("Jim", 1)
    val sam = Gnome("Sam", 5)
    val eli = Gnome("Eli", 8)
    val amy = Gnome("Amy", 9)

    check(jim.info() == "Jim is on step 1")
    check(sam.info() == "Sam is on step 5")
    check(eli.info() == "Eli is on step 8")
    check(amy.info() == "Amy is on step 9")
}

class Gnome(val name: String, var step: Int) {
    init {
        println("Creating a gnome... ${info()}")
    }

    fun info(): String {
        return "$name is on step $step"
    }
}

