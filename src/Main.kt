/**
 * ================================================
 * Garden Gnomes
 *
 * A bunch of gnomes have appeared in your garden!
 *
 *    /\      /\      /\
 *   ('')    (oo)    (xx)
 * __{__}____{__}____{__}__
 *
 * Each gnome has a particular activity that it
 * specialises in: fishing, digging, smoking a
 * pipe, etc.
 *
 * Gnomes are generally friendly little things, but
 * they do have a bad temper when provoked. If you
 * poke them, they will get cross. Often a pat on
 * head can help calm them down
 * ================================================
 */


fun main() {
    println("Gnomes")
    println("------------------------")

    // Creating gnomes

    val jim = Gnome("Jim", "fishing")
    val sam = Gnome("Sam", "digging")
    val amy = Gnome("Amy", "sitting")

    println("------------------------")

    // Checking gnome anger

    check(jim.angerLevel == 1)
    check(sam.angerLevel == 1)
    check(amy.angerLevel == 1)

    check(jim.anger() == "calm")
    check(sam.anger() == "calm")
    check(amy.anger() == "calm")

    println("------------------------")

    // Showing gnome info

    println(jim.info())
    println(sam.info())
    println(amy.info())

    check(jim.info() == "Jim is fishing and is calm")
    check(sam.info() == "Sam is digging and is calm")
    check(amy.info() == "Amy is sitting and is calm")

    println("------------------------")

    // Poking some gnomes

    jim.poke(1)                     // Should still be calm
    println(jim.info())
    check(jim.angerLevel == 2)
    check(jim.anger() == "calm")

    jim.poke(1)                     // Should now be annoyed
    println(jim.info())
    check(jim.angerLevel == 3)
    check(jim.anger() == "annoyed")

    jim.poke(10)                    // Should now be max anger
    println(jim.info())
    check(jim.angerLevel == 10)
    check(jim.anger() == "apoplectic")

    sam.poke(5)                     // Should now angry
    println(sam.info())
    check(sam.angerLevel == 6)
    check(sam.anger() == "angry")

    amy.poke(7)                     // Should now furious
    println(amy.info())
    check(amy.angerLevel == 8)
    check(amy.anger() == "furious")


    println("------------------------")

    // Patting the gnomes to calm them

    jim.pat(9)                      // Should now be calm
    println(jim.info())
    check(jim.angerLevel == 1)
    check(jim.anger() == "calm")

    sam.pat(9)                      // Should now be calm
    println(sam.info())
    check(sam.angerLevel == 1)
    check(sam.anger() == "calm")

    amy.pat(10)                     // Too many pats!
    println(amy.info())
    check(amy.angerLevel == 10)
    check(amy.anger() == "apoplectic")

    amy.pat(9)                      // And calm again
    println(amy.info())
    check(amy.angerLevel == 1)
    check(amy.anger() == "calm")

}


/**
 * Gnome class
 *
 * Gnomes are instantiated with a name and
 * an action (e.g. fishing) and have their
 * anger level initially set to 1 (calm)
 */
class Gnome(val name: String, var activity: String) {
    var angerLevel = 1

    init {
        println("Creating a gnome... $name")
    }

    /**
     * Show info about the gnome in the form
     *  NAME is ACTIVITY and is ANGER WORD
     */
    fun info(): String {
        return "$name is $activity and is ${anger()}"
    }

    /**
     * Return a word relating to the gnome's anger level:
     * - 1-2  -> calm
     * - 3-4  -> annoyed
     * - 5-6  -> angry
     * - 7-8  -> furious
     * - 9-10 -> apoplectic
     */
    fun anger(): String {
        if (angerLevel in 1..2) return "calm"
        else if (angerLevel in 3..4) return "annoyed"
        else if (angerLevel in 5..6) return "angry"
        else if (angerLevel in 7..8) return "furious"
        else if (angerLevel in 9..10) return "apoplectic"
        else return "ERROR"
    }

    /**
     * Poking a gnome makes it angrier
     * The anger level goes up 1 for
     * every poke, up to a max of 10
     */
    fun poke(numPokes: Int) {
        println("$name gets poked $numPokes times...")
        angerLevel = angerLevel + numPokes
        if (angerLevel > 10) angerLevel = 10
        println("$name is ${anger()}")
    }

    /**
     * Patting a gnome makes it calmer
     * The anger level goes down 1 for
     * every pat, down to a min of 1
     * However, if more than 10 pats are
     * given in one go, the anger level
     * will go to 10 instantly!
     */
    fun pat(numPats: Int) {
        println("$name gets patted $numPats times...")


    }
}

