package polymorphism2

class cow : hewan() {

    fun moo() {
        println("Suara ku moo")
    }

    override fun perkenalan() {
        println("Hai biasanya aku berada di padang rumput dan aku adalah hewan qurban")
    }
}